package com.teamvietdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author TVD
 */
@Controller
@RequestMapping(value = "")
public class ControllerPages {

    @RequestMapping(value = "home.html", method = RequestMethod.GET)
    public String viewHome(ModelMap mm) {

        return "view/index";
    }

    @RequestMapping(value = "about.html", method = RequestMethod.GET)
    public String viewAbout(ModelMap mm) {

        return "view/about";
    }

    @RequestMapping(value = "shop.html", method = RequestMethod.GET)
    public String viewShop(ModelMap mm) {

        return "view/shop";
    }

    @RequestMapping(value = "contact.html", method = RequestMethod.GET)
    public String viewContact(ModelMap mm) {

        return "view/contact";
    }

    @RequestMapping(value = "category.html", method = RequestMethod.GET)
    public String viewCategory(ModelMap mm) {

        return "view/shop";
    }

    @RequestMapping(value = "product.html", method = RequestMethod.GET)
    public String viewProduct(ModelMap mm) {

        return "view/single";
    }

}
