package br.rodriguesxxx.services;

import jakarta.jws.WebService;

import java.time.LocalDateTime;
import java.util.Date;

@WebService(endpointInterface = "br.rodriguesxxx.services.IDaysOfLifeService")
public class DaysOfLifeService implements IDaysOfLifeService{

//    public Integer calculate(Date dataOfBirth) {
//        LocalDateTime currentDate = LocalDateTime.now();
//        Integer age = currentDate.getYear() - dataOfBirth.getYear();
//        Integer currentDays = dataOfBirth.getMonth() * 30 + dataOfBirth.getDay();
//        Integer daysOfLife = (age * 365) + currentDays;
//        return daysOfLife;
//    }
    public String calculate(String year, String month, String day) {
        LocalDateTime currentDate = LocalDateTime.now();
        Integer age = currentDate.getYear() - Integer.valueOf(year);
        Integer currentDays = Integer.valueOf(month) * 30 + Integer.valueOf(day);
        Integer daysOfLife = (age * 365) + currentDays;
        return daysOfLife.toString();
    }

}

