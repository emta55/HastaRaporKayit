package com.emta.rapor.controller;

import com.emta.rapor.model.Patient;
import com.emta.rapor.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    PatientServices service;

    @RequestMapping("/")
    public String viewHomePage(Model model){
        List<Patient> listPatient = service.listAll();
        model.addAttribute("listPatient",listPatient);
        return "index";
    }

    @RequestMapping("/new")
    public String newPatientPage(Model model){
        Patient patient = new Patient();
        model.addAttribute(patient);
        return "new_patient";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePatient(@ModelAttribute ("patient") Patient patient ){
        service.save(patient);
        return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public ModelAndView showEditPatientPage(@PathVariable (name = "id") Long id){
        ModelAndView mav = new ModelAndView("edit_patient");
        Patient patient= service.get(id);
        mav.addObject("patient",patient);
        return mav;
    }
    @RequestMapping("delete/{id}")
    public String deletePatientPage(@PathVariable (name = "id") Long id){
        service.delete(id);
        return "redirect:/";
    }
}
