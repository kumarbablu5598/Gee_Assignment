package com.urlhitcounter.services;

import com.urlhitcounter.visit.Visit;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UrlHitService  {

      Map<String,Integer> map = new HashMap<>() ;
      public  Visit getVisit( String username)
      {
          map.put(username,map.getOrDefault(username,0)+1);
          return new Visit(username,map.get(username));


      }



}
