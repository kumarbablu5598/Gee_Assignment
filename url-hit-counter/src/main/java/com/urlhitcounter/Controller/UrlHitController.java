package com.urlhitcounter.Controller;
import com.urlhitcounter.services.UrlHitService;
import com.urlhitcounter.visit.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/visitor-count-app")

public class UrlHitController {
   @Autowired
   private UrlHitService urlHitService;
   @GetMapping("/username/{username}/count")
   public Visit getCount(@PathVariable String username)
   {
      return urlHitService.getVisit(username);
   }

}

