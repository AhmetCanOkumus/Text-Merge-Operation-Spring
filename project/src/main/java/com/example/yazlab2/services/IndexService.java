package com.example.yazlab2.services;
import com.example.yazlab2.models.Save;
import com.example.yazlab2.models.User;
import com.example.yazlab2.repositories.SaveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class IndexService {
    List<String> list=new ArrayList<String>();
    String birlesmistring;
    @Autowired
    private SaveRepository saveRepository;


    public ModelAndView register(){


        User user;
        ModelAndView model= new ModelAndView();


        ArrayList<String> liste1 = new ArrayList<>();
        ArrayList<String> liste2 = new ArrayList<>();
        ArrayList<String> liste3 = new ArrayList<>();
        ArrayList<String> liste4 = new ArrayList<>();
        ArrayList<String> liste5 = new ArrayList<>();
        ArrayList<String> liste6 = new ArrayList<>();
        ArrayList<String> liste7 = new ArrayList<>();
        ArrayList<String> liste8 = new ArrayList<>();
        ArrayList<String> liste9 = new ArrayList<>();
        ArrayList<String> liste10 = new ArrayList<>();



        int boyut=list.size();


        String[]  dizi1 = (list.get(0)).split(" ");
        String[]  dizi2 = (list.get(1)).split(" ");


        ArrayList<String> esitkelimeler = new ArrayList<>();
        ArrayList<String> farklikelimeler = new ArrayList<>();
        ArrayList<String> cumlebirlestir = new ArrayList<>();

        long baslangic=System.nanoTime();
        for(int n=0;n<1;n++) {
            if (list.size() == 3) {
                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }
            }

            if (list.size() == 4) {

                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

            }
            if (list.size() == 5) {

                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

                String[] dizi5 = (list.get(4)).split(" ");
                for (int i = 0; i < dizi5.length; i++) {
                    liste5.add(dizi5[i]);
                }

            }

            if (list.size() == 6) {

                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

                String[] dizi5 = (list.get(4)).split(" ");
                for (int i = 0; i < dizi5.length; i++) {
                    liste5.add(dizi5[i]);
                }

                String[] dizi6 = (list.get(5)).split(" ");
                for (int i = 0; i < dizi6.length; i++) {
                    liste6.add(dizi6[i]);
                }

            }

            if (list.size() == 7) {
                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

                String[] dizi5 = (list.get(4)).split(" ");
                for (int i = 0; i < dizi5.length; i++) {
                    liste5.add(dizi5[i]);
                }

                String[] dizi6 = (list.get(5)).split(" ");
                for (int i = 0; i < dizi6.length; i++) {
                    liste6.add(dizi6[i]);
                }
                String[] dizi7 = (list.get(6)).split(" ");
                for (int i = 0; i < dizi7.length; i++) {
                    liste7.add(dizi7[i]);
                }

            }

            if (list.size() == 8) {
                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

                String[] dizi5 = (list.get(4)).split(" ");
                for (int i = 0; i < dizi5.length; i++) {
                    liste5.add(dizi5[i]);
                }

                String[] dizi6 = (list.get(5)).split(" ");
                for (int i = 0; i < dizi6.length; i++) {
                    liste6.add(dizi6[i]);
                }
                String[] dizi7 = (list.get(6)).split(" ");
                for (int i = 0; i < dizi7.length; i++) {
                    liste7.add(dizi7[i]);
                }

                String[] dizi8 = (list.get(7)).split(" ");
                for (int i = 0; i < dizi8.length; i++) {
                    liste8.add(dizi8[i]);
                }
            }


            if (list.size() == 9) {
                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

                String[] dizi5 = (list.get(4)).split(" ");
                for (int i = 0; i < dizi5.length; i++) {
                    liste5.add(dizi5[i]);
                }

                String[] dizi6 = (list.get(5)).split(" ");
                for (int i = 0; i < dizi6.length; i++) {
                    liste6.add(dizi6[i]);
                }
                String[] dizi7 = (list.get(6)).split(" ");
                for (int i = 0; i < dizi7.length; i++) {
                    liste7.add(dizi7[i]);
                }

                String[] dizi8 = (list.get(7)).split(" ");
                for (int i = 0; i < dizi8.length; i++) {
                    liste8.add(dizi8[i]);
                }

                String[] dizi9 = (list.get(8)).split(" ");
                for (int i = 0; i < dizi9.length; i++) {
                    liste9.add(dizi9[i]);
                }
            }

            if (list.size() == 10) {
                String[] dizi3 = (list.get(2)).split(" ");
                for (int i = 0; i < dizi3.length; i++) {

                    liste3.add(dizi3[i]);
                }

                String[] dizi4 = (list.get(3)).split(" ");
                for (int i = 0; i < dizi4.length; i++) {
                    liste4.add(dizi4[i]);
                }

                String[] dizi5 = (list.get(4)).split(" ");
                for (int i = 0; i < dizi5.length; i++) {
                    liste5.add(dizi5[i]);
                }

                String[] dizi6 = (list.get(5)).split(" ");
                for (int i = 0; i < dizi6.length; i++) {
                    liste6.add(dizi6[i]);
                }
                String[] dizi7 = (list.get(6)).split(" ");
                for (int i = 0; i < dizi7.length; i++) {
                    liste7.add(dizi7[i]);
                }

                String[] dizi8 = (list.get(7)).split(" ");
                for (int i = 0; i < dizi8.length; i++) {
                    liste8.add(dizi8[i]);
                }

                String[] dizi9 = (list.get(8)).split(" ");
                for (int i = 0; i < dizi9.length; i++) {
                    liste9.add(dizi9[i]);
                }
                String[] dizi10 = (list.get(9)).split(" ");
                for (int i = 0; i < dizi10.length; i++) {
                    liste10.add(dizi10[i]);
                }
            }


            for (int i = 0; i < dizi1.length; i++) {
                liste1.add(dizi1[i]);
            }

            for (int i = 0; i < dizi2.length; i++) {
                liste2.add(dizi2[i]);
            }

            cumlebirlestir.add(list.get(0));

            for (int i = 0; i < liste1.size(); i++) {
                for (int j = 0; j < liste2.size(); j++) {
                    if (liste1.get(i).equals(liste2.get(j))) {
                        esitkelimeler.add(liste1.get(i));
                    }
                }
            }


            for (String word : liste2) {
                if (!esitkelimeler.contains(word)) {
                    farklikelimeler.add(word);
                    cumlebirlestir.add(word);
                }

            }

            if (list.size() == 3) {
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }
            }

            if (list.size() == 4) {

                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }

            if (list.size() == 5) {

                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste5.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste5.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste5) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }


            if (list.size() == 6) {


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste5.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste5.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste5) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste6.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste6.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste6) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }

            if (list.size() == 7) {


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste5.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste5.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste5) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste6.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste6.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste6) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste7.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste7.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste7) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }

            if (list.size() == 8) {


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste5.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste5.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste5) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste6.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste6.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste6) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste7.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste7.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste7) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste8.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste8.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste8) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }


            if (list.size() == 9) {


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste5.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste5.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste5) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste6.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste6.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste6) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste7.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste7.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste7) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste8.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste8.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste8) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste9.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste9.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste9) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }

            if (list.size() == 10) {

                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste3.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste3.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String words : liste3) {
                    if (!esitkelimeler.contains(words)) {
                        farklikelimeler.add(words);
                        cumlebirlestir.add(words);
                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste4.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste4.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste4) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste5.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste5.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste5) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }


                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste6.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste6.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }

                for (String wordss : liste6) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste7.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste7.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste7) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste8.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste8.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste8) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste9.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste9.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste9) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
                for (int i = 0; i < cumlebirlestir.size(); i++) {
                    for (int j = 0; j < liste10.size(); j++) {
                        if (cumlebirlestir.get(i).equals(liste10.get(j))) {
                            esitkelimeler.add(cumlebirlestir.get(i));

                        }
                    }

                }
                for (String wordss : liste10) {
                    if (!esitkelimeler.contains(wordss)) {
                        farklikelimeler.add(wordss);
                        cumlebirlestir.add(wordss);

                    }
                }
            }
        }



        long bitis= System.nanoTime();

        long fark=bitis-baslangic;
        DecimalFormat formatter3 = new DecimalFormat("0.000000000");

        double saniye=(double)fark/1000000000.0;
        user.setSure(saniye);

        birlesmistring = cumlebirlestir.toString();
        birlesmistring = birlesmistring.replaceAll(", ", " ").replaceAll("\\[|\\]", "");
        System.out.println(birlesmistring);


        user.setMetinuc(birlesmistring);


        model.setViewName("deneme");
        model.addObject("user",user);
        return model;


    }



}
