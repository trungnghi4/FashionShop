package com.NTQ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "")
public class ControllerPages {

    @RequestMapping(value = "home.html", method = RequestMethod.GET)
    public String viewHome(ModelMap mm) {

        return "index";
    }

    @RequestMapping(value = "about.html", method = RequestMethod.GET)
    public String viewAbout(ModelMap mm) {

        return "about";
    }

    @RequestMapping(value = "shop.html", method = RequestMethod.GET)
    public String viewShop(ModelMap mm) {

        return "shop";
    }

    @RequestMapping(value = "contact.html", method = RequestMethod.GET)
    public String viewContact(ModelMap mm) {

        return "contact";
    }

    @RequestMapping(value = "category.html", method = RequestMethod.GET)
    public String viewCategory(ModelMap mm) {

        return "shop";
    }

    @RequestMapping(value = "product.html", method = RequestMethod.GET)
    public String viewProduct(ModelMap mm) {

        return "single";
    }

}
