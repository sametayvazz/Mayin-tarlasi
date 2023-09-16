/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayıntarlası;

import java.util.Random;
import java.util.Scanner;


public class MayınTarlası {

    
    public static void main(String[] args) {
       int satir,sutun;
       Scanner deger = new Scanner(System.in);
       System.out.print("Lütfen satır sayısı giriniz: ");
       satir=deger.nextInt();
       System.out.print("Lütfen sütur sayısı giriniz: ");
       sutun=deger.nextInt();
       int [][] alan = new int[satir][sutun];
        for (int i = 0; i < satir ; i++) 
        {
            for (int j = 0; j <  sutun; j++) 
            {
                System.out.print("  "+alan[i][j]);
            }
            System.out.println("");
            
        }
         int zorluk,msatir,msutun,msayisi;         
         int[][] yer = new int[satir][sutun];
         System.out.print("Lütfen 20 ile 80 arasında zorluk derecesi seçiniz\n");
         zorluk=deger.nextInt();
         double a = zorluk * 0.01;
         msayisi=(int)(satir*sutun*a);
         Random sayi = new Random();
         for (int i = 0; i < msayisi ; i++) 
         {
            msatir= sayi.nextInt(satir);
            msutun = sayi.nextInt(sutun);
             if (yer[msatir][msutun] == 1)
             {
               try
               {
               yer[msatir-1][msutun-1]=1;
               }
               catch (Exception e)
               {
               System.out.print("hata="+e+"\n");
               }
               
             }
            
             else
             {
             yer[msatir][msutun]=1;
             }
         }
         for (int i = 0; i < satir; i++) 
         {
             for (int j = 0; j < sutun; j++) 
             {
                 if (yer[i][j] !=1)
                 {
                     yer[i][j] =0;
                 }
             }
             
         }           
           System.out.print("Mayınlar yerleştirildi\n");
           
             for (int i = 0; i < satir; i++) 
             {
                 for (int j = 0; j < sutun; j++) 
                 {
                     
                     System.out.println(yer[i][j]+"  ");
                 }
                 System.out.println("");
                 
             }
          System.out.print("Oyun Başlasın\n");
             int puan =0;
             String[][] sonuc=new String[satir][sutun];
             for (int i = 0; i < satir; i++) 
             {
                 for (int j = 0; j < sutun; j++) 
                 {
                     sonuc[i][j]="*";
                 }
             }
             
             System.out.print("Satır değeri giriniz: ");
             int satir2 = deger.nextInt();
             System.out.print("Sütun değeri giriniz: ");
             int sutun2 = deger.nextInt();
             if(yer[satir2][sutun2]==1)
             {
             System.out.print("Oyun bitti ..\n Toplam puanınız =" + puan + "\n");
                 for (int i = 0; i < satir; i++) 
                 {
                     for (int j = 0; j < sutun; j++) 
                     {
                         System.out.print(yer[i][j]+ "  ");
                         
                     }
                     System.out.println("");     
                     
                 }                       
                
             }             
             else
             {
             sonuc[satir2][sutun2]="I0";
             puan+=5;
                 for (int i = 0; i < satir; i++) 
                 {
                     for (int j = 0; j < sutun; j++) 
                     {
                         System.out.print(sonuc[i][j]+"  ");
                     }
                     System.out.println("");
                     
                 }
                 
             }
             
        }
    }

   

