package proje;

import java.util.Random;
import java.util.Scanner;

public class tahminOyunu {

public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int puan = 0;
		
		System.out.println("========== Tahmin Oyununa Hoşgeldiniz ==========");
		
		System.out.println("Oyun Açıklaması = Bilgisayar 1 ile 100 arası random bir sayı tutucak .  Size 3 soru sorulucaktır .\n"
		        + "Puanınıza göre bilgisyarın random tutuğu sayıyla alakalı bilgi alıcaksınız ve en az tahminde sayıyı bulan kazanır .\n");
		
		    
		
		System.out.println("Soru 1 = Aşağıdaki ifadelerden hangisi protected erişim düzeyini en iyi açıklar?\n"
				         + "A) Sadece tanımlandığı sınıfta erişilir\r\n"
				         + "B) Aynı pakette ve alt sınıflarda erişilir\n"
				         + "C) Her yerden erişilir\n"
				         + "D) Hiçbir yerden erişilmez\n");
	   String cevap1 = scanner.nextLine();
	   System.out.println();
	   
	   if (cevap1.equals("B")) {
			
		   System.out.println("1. Soruyu Doğru Cevapladınız Tebrikler :)\n");
		  puan += 1;
	   }
	   
	   else {
		
		   System.out.println("1. Soruyu Yanlış Cevapladınız Erişim Belirteci Konusuna Tekrar Çalışınız...\n");
       }
	   
	   
	   
		
	   System.out.println("Soru 2 = Aşağıdaki kod parçasının çıktısı ne olur?\n" 
			            + "for(int i = 1; i <= 5; i++) {\n"
			            + "if(i == 3) continue;"
			            + " System.out.print(i + \" \");\n"
			            + "}\n"
			            + "A) 1 2 3 4 5\n"
			            + "B) 2 3 4 5\n"
			            + "C) 1 2 3 4\n"
			            + "D) 1 2 4 5\n" );
	   String cevap2 = scanner.nextLine();
	   System.out.println();
		
	   if (cevap2.equals("D")) {
			
		   System.out.println("2. Soruyu Doğru Cevapladınız Tebrikler :)\n");
		  puan += 1;
	   }
	   
	   else {
		
		   System.out.println("2. Soruyu Yanlış Cevapladınız Döngüler Konusuna Tekrar Çalışınız...\n");
       }
	   
	   
	   
	   
	   
	   
	   System.out.println("Soru 3 = Aşağıdaki kodun çıktısı ne olur?\n"
	   		+ "int[] dizi = {2, 4, 6, 8};\n"
	   		+ "System.out.println(dizi.length);\n"
	   		+ "A) 4\n"
	   		+ "B) 3\n"
	   		+ "C) 5\n"
	   		+ "D) Hata verir\n");
	   		
	   String cevap3 = scanner.nextLine();
	   System.out.println();	
	   
	   
	   if (cevap3.equals("A")) {
			
		   System.out.println("3. Soruyu Doğru Cevapladınız Tebrikler :)\n");
		  puan += 1;
	   }
	   
	   else {
		
		   System.out.println("3. Soruyu Yanlış Cevapladınız Diziler Konusuna Tekrar Çalışınız...\n");
       }
	  
	   
	   
	   
	   
	   
	   
	   int hedefSayi = random.nextInt(100) + 1; 
		int tahmin;
		int denemeSayisi = 0; 
	   
	  
	   
	   
	 
	   
	   if (puan==0) 
	   {
		System.out.println("Puanınız : 0 Olduğu tutlan sayı ile alakalı bilgi almıyacaksınız :(\n");
		 do {
				System.out.print("Tahminde bulununuz : ");
			    tahmin = scanner.nextInt();
			    denemeSayisi +=1;
			    
			    if (tahmin>hedefSayi)
			    {
					System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
					
				}
			    else if (tahmin<hedefSayi) 
			    {
					System.out.println("Tahminiz tutulan sayıdan küçüktür .");
					
				}
			    
			    else if (tahmin==hedefSayi) 
			    {
					System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
							           + "Toplam Deneme Sayınız : " + denemeSayisi);
					
				}
		      
		      } while (tahmin!=hedefSayi);
	   }
	   
	   
	   
	   
	   else if (puan==1) 
	   {
		   
		   if (hedefSayi<=50)
		   {
		   System.out.println("Puanınız : 1\n"
				            + "Tutulan sayı 1 - 50 arasınıda");
		     
		      do {
				System.out.print("Tahminde bulununuz : ");
			    tahmin = scanner.nextInt();
			    denemeSayisi +=1;
			    
			    if (tahmin>hedefSayi)
			    {
					System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
					
				}
			    else if (tahmin<hedefSayi) 
			    {
					System.out.println("Tahminiz tutulan sayıdan küçüktür .");
					
				}
			    
			    else if (tahmin==hedefSayi) 
			    {
					System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
							           + "Toplam Deneme Sayınız : " + denemeSayisi);
					
				}
		      
		      } while (tahmin!=hedefSayi);
		      
		   
		   
		   
		     }
		   
		   
	  
	          else 
	         {
	    	   System.out.println("Puanınız : 1\n"
			            + "Tutulan sayı 51 - 100 arasınıda");
	    	   do {
					System.out.print("Tahminde bulununuz : ");
				    tahmin = scanner.nextInt();
				    denemeSayisi+=1;
				    
				    if (tahmin>hedefSayi)
				    {
						System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
						
					}
				    else if (tahmin<hedefSayi) 
				    {
						System.out.println("Tahminiz tutulan sayıdan küçüktür .");
						
					}
				    
				    else if (tahmin==hedefSayi) {
						System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
							           	+ "Toplam  Deneme Sayınız : " + denemeSayisi);
						
					}
			      
			      } while (tahmin!=hedefSayi);
		        }
	   
		   
		   
		   
	   
	   
	   }
	   
	   
	   
	   
	   
	   else if (puan==2) 
{
		   
		   if (hedefSayi<=25)
		       {
		   System.out.println("Puanınız : 2\n"
				            + "Tutulan sayı 1 - 25 arasınıda");
		     
		      do {
				System.out.print("Tahminde bulununuz : ");
			    tahmin = scanner.nextInt();
			    denemeSayisi +=1;
			    
			    if (tahmin>hedefSayi)
			    {
					System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
					
				}
			    else if (tahmin<hedefSayi) 
			    {
					System.out.println("Tahminiz tutulan sayıdan küçüktür .");
					
				}
			    
			    else if (tahmin==hedefSayi) 
			    {
					System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
							           + "Toplam Deneme Sayınız : " + denemeSayisi);
					
				}
		      
		      } while (tahmin!=hedefSayi);
		       }
		   
		   
		   
		   else if (hedefSayi<=50) {
			   System.out.println("Puanınız : 2\n"
			            + "Tutulan sayı 26 - 50 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	       } while (tahmin!=hedefSayi);
		   }
		   
		   
		   else if (hedefSayi<=75) {
			   System.out.println("Puanınız : 2\n"
			            + "Tutulan sayı 51 - 75 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
		  }
		   
		   
		   
		   else {
			   System.out.println("Puanınız : 2\n"
			            + "Tutulan sayı 75 - 100 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
		  }
		   
		   
}
	   
	   
	   else if (puan==3)
{
		   if (hedefSayi<=2)
	       {
	   System.out.println("Puanınız : 3\n"
			            + "Tutulan sayı 1 - 20 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
	       }

		   
		   
		   
		   
		   else if (hedefSayi<=40) {
			   System.out.println("Puanınız : 3\n"
			            + "Tutulan sayı 21 - 40 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
		  }
		   
		   else if (hedefSayi<=60) {
			   System.out.println("Puanınız : 3\n"
			            + "Tutulan sayı 41 - 60 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
		  }
		   
		   
		   
		   
		   else if (hedefSayi<=80) {
			   System.out.println("Puanınız : 3\n"
			            + "Tutulan sayı 61 - 80 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
		  }
		   
		   
		   
		   
		   else if (hedefSayi<=100) {
			   System.out.println("Puanınız : 3\n"
			            + "Tutulan sayı 81 - 100 arasınıda");
	     
	      do {
			System.out.print("Tahminde bulununuz : ");
		    tahmin = scanner.nextInt();
		    denemeSayisi +=1;
		    
		    if (tahmin>hedefSayi)
		    {
				System.out.println("Tahmininiz tutulan sayıdan büyüktür .");
				
			}
		    else if (tahmin<hedefSayi) 
		    {
				System.out.println("Tahminiz tutulan sayıdan küçüktür .");
				
			}
		    
		    else if (tahmin==hedefSayi) 
		    {
				System.out.println("Doğru tahminde Bulundunuz tebrikler :)\n"
						           + "Toplam Deneme Sayınız : " + denemeSayisi);
				
			}
	      
	      } while (tahmin!=hedefSayi);
		  }
		  

         }	
	   
	   
	   
	   
	   
	   
	   
  }
}
