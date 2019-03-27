//package com.ShopK.controller;
//
//import com.ShopK.service.CategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

package com.ShopK.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ShopK.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author TVD
 */
@Controller
@RequestMapping(value = "")
public class ControllerPages {
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(value = "home.html", method = RequestMethod.GET)
    public String viewHome(ModelMap mm) {
        mm.put("listCategory", categoryService.getAll());
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

    @RequestMapping(value = "category/{categoryUrl}/{categoryId}.html", method = RequestMethod.GET)
    public String viewCategory(ModelMap mm) {

        return "view/shop";
    }

    @RequestMapping(value = "product/{productUrl}/{productId}.html", method = RequestMethod.GET)
    public String viewProduct(ModelMap mm) {

        return "view/single";
    }

}