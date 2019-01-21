package com.stackroute.springboot.seeddate;

import com.stackroute.springboot.domain.Track;
//import com.stackroute.springboot.repository.TrackRepo;
import com.stackroute.springboot.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//
@Component
//@Configuration

public class SeedDate implements CommandLineRunner

    {

        private TrackService trackService;

    @Autowired

    public SeedDate(TrackService trackService) {

            this.trackService = trackService;
        }

        @Override

        public void run(String... args) throws Exception {
            Track t1 = Track.builder().tName("Khamas").tComment("TMK").build();
            trackService.saveTrack(t1);
            Track t2 = Track.builder().tName("Sahana").tComment("RaGa").build();
            trackService.saveTrack(t2);
            Track t3 = Track.builder().tName("Kambhoji").tComment("MS").build();
            trackService.saveTrack(t3);
            Track t4 = Track.builder().tName("Bhairav").tComment("DKP").build();
            trackService.saveTrack(t4);
            Track t5 = Track.builder().tName("Nattai").tComment("TKG").build();
            trackService.saveTrack(t5);
            Track t6 = Track.builder().tName("Varali").tComment("SS").build();
            trackService.saveTrack(t6);
            Track t7 = Track.builder().tName("Kalyani").tComment("RM").build();
            trackService.saveTrack(t7);
            Track t8 = Track.builder().tName("Mohana").tComment("BV").build();
            trackService.saveTrack(t8);
            Track t9 = Track.builder().tName("Deewani Mastani").tComment("Shreya Ghoshal").build();
            trackService.saveTrack(t9);
            Track t10 = Track.builder().tName("Aankh Maarey").tComment("Neha Kakkar").build();
            trackService.saveTrack(t10);
//        Track t1=new Track("Khamas","TMK");

//        trackService.saveTrack(t1);



        }



    }


