package org.example.vaultingcalcspringapi.services;

import org.example.vaultingcalcspringapi.model.HorseInput;
import org.example.vaultingcalcspringapi.model.HorseResponse;
import org.example.vaultingcalcspringapi.model.TechResponse;
import org.springframework.stereotype.Service;

@Service
public class ScoreCountService {
    public TechResponse CalculateTotalTechScore(TechResponse input, int HardestDiffMaxNumber, double rmultipler, double dmultipler, double mmultipler, double emultipler, boolean IsDifficultyofDegree) {
        double performancetotal=0;
        double difficultytotal=0;
        double sumofexercises=input.getSumofexercises();
        if (IsDifficultyofDegree) {
            if ((input.getRcount()+input.getDcount()+input.getMcount()+input.getEcount())< HardestDiffMaxNumber){
                difficultytotal=(input.getRcount()*rmultipler)+(input.getDcount()*dmultipler)+(input.getMcount()*mmultipler)+(input.getEcount()*emultipler);
                if (difficultytotal > 10){
                    difficultytotal=10.0;
                }
            } else if ((input.getRcount()+input.getDcount()+input.getMcount())< HardestDiffMaxNumber) {
                difficultytotal=(input.getRcount()*rmultipler)+(input.getDcount()*dmultipler)+(input.getMcount()*mmultipler)+(HardestDiffMaxNumber-(input.getRcount()+input.getDcount()+input.getMcount()))*emultipler;

                if (difficultytotal > 10){
                    difficultytotal=10.0;
                }
            } else if ((input.getRcount()+input.getDcount())< HardestDiffMaxNumber) {
                difficultytotal=(input.getRcount()*rmultipler)+(input.getDcount()*dmultipler)+(HardestDiffMaxNumber-(input.getRcount()+input.getDcount()))*mmultipler;

                if (difficultytotal > 10){
                    difficultytotal=10.0;
                }
            }else if ((input.getRcount())< HardestDiffMaxNumber) {
                difficultytotal=(input.getRcount()*rmultipler)+(HardestDiffMaxNumber-(input.getRcount()))*dmultipler;

                if (difficultytotal > 10){
                    difficultytotal=10.0;
                }
            }else{
                difficultytotal=input.getRcount()*rmultipler;
            }
            performancetotal=10-input.getDeductions()/sumofexercises;
            performancetotal=performancetotal-input.getFalldeductions();
            double total = (performancetotal*0.7)+(difficultytotal*0.3);
            input.setTotal(Math.round(total*1000.0)/1000.0);
            input.setDifficultytotal(Math.round(difficultytotal*1000.0)/1000.0);
            input.setPerformancetotal(Math.round(performancetotal*1000.0)/1000.0);
            return input;}
        else {
            performancetotal=10-input.getDeductions()/sumofexercises;
            performancetotal=performancetotal-input.getFalldeductions();
            double total = (performancetotal);
            input.setTotal(Math.round(total*1000.0)/1000.0);
            input.setDifficultytotal(Math.round(difficultytotal*1000.0)/1000.0);
            input.setPerformancetotal(Math.round(performancetotal*1000.0)/1000.0);
            return input;
        }


    }
    public HorseResponse HorseScoreCalculate(HorseInput input) {
        double a1=0;
        double a2=0;
        double a3=0;
        double total=0;
        a1=(input.getRhythm()+input.getRelaxation()+input.getConnection()+input.getImpulsion()+input.getStraightness()+input.getCollection())/6;
        a2=(input.getWillingnessAndObedience()*0.5)+(input.getBalanceInTempo()*0.25)+(input.getBalanceInCircling()*0.25);
        a3=(input.getA3());
        a2-=input.getA2deductions();
        a3-=input.getA3deductions();
        a1*=0.6;
        a2*=0.25;
        a3*=0.15;
        total= a1+a2+a3;
        double rtotal = Math.round(total*1000.0)/1000.0;
        double ra1 = Math.round(a1*1000.0)/1000.0;
        double ra2 = Math.round(a2*1000.0)/1000.0;
        double ra3 = Math.round(a3*1000.0)/1000.0;
        return new HorseResponse(input,ra1,ra2,ra3,rtotal);
    }




}
