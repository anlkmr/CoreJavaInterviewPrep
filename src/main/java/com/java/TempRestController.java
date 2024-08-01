package com.java;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping({"/home"})
public class TempRestController {

    @PostMapping({"/processlist"})
    public ResponseEntity<?> processList(
            @RequestBody Test100 testdataList
    ){
        if(null != testdataList){

            for(TempData hold: testdataList.dataList){

                // Creating the individual file
                //pojo creation if we are using pojo to file creation

                var butesToprocess = hold.toString().getBytes(StandardCharsets.UTF_8);

                //
            }
        }




        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body("success");
    }

}
