package org.example.vaultingcalcspringapi.services;

import org.example.vaultingcalcspringapi.model.TechResponse;
import org.springframework.stereotype.Service;

@Service
public class StringResolverService {
    public TechResponse ResolveString(String input) {
        int ecount=0;
        int rcount=0;
        int mcount=0;
        int dcount=0;
        int deductions=0;


        double falldeductions=0.0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' '){
                continue;
            }
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                deductions+=digit;
                continue;
            }

            if (c == 'F'|| c == 'f'){
                if (i+2 < input.length() && input.charAt(i+2) == '0') {
                    c = input.charAt(i + 1);
                    double digit = Character.getNumericValue(c);
                    falldeductions+=digit;
                    i=i+2;
                }
                else {
                    c = input.charAt(i + 1);
                    double digit = (double) Character.getNumericValue(c) /10;
                    falldeductions+=digit;
                    i=i+1;
                }
                continue;

            }
            switch (c){
                case 'E' :
                case 'e':
                    ecount++;
                    break;
                case 'R' :
                case 'r':
                    rcount++;
                    break;
                case 'M' :
                case 'm':
                    mcount++;
                    break;
                case 'D' :
                case 'd':
                    dcount++;
                    break;

            }
        }
        int sumofexercises = ecount+rcount+mcount+dcount;
        return new TechResponse(ecount,rcount,mcount,dcount,deductions,sumofexercises,falldeductions);
    }
}
