package ders9.lambda

/*
filter	        Belirtilen koşulu sağlayan elemanları seçerek yeni bir liste oluşturur.	sayilar.filter { it > 10 }
map	            Her elemanı başka bir değere dönüştürerek yeni bir liste oluşturur.	sayilar.map { it * 2 }
forEach	        Her eleman üzerinde belirtilen işlemi gerçekleştirir.	sayilar.forEach { println(it) }
sorted	        Elemanları küçükten büyüğe sıralayarak yeni bir liste oluşturur.	sayilar.sorted()
reversed	    Listenin elemanlarını ters sırada yeni bir liste olarak verir.	sayilar.reversed()
first	        Listenin ilk elemanını getirir.	sayilar.first()
last	        Listenin son elemanını getirir.	sayilar.last()
find	        Belirtilen koşulu sağlayan ilk elemanı bulur.	sayilar.find { it > 10 }
any	            En az bir eleman koşulu sağlıyorsa true döndürür.	sayilar.any { it > 10 }
all	            Bütün elemanlar koşulu sağlıyorsa true döndürür.	sayilar.all { it > 0 }
count	        Belirtilen koşulu sağlayan elemanların sayısını verir.	sayilar.count { it > 10 }
distinct	    Tekrarlanan değerleri kaldırarak benzersiz elemanlardan oluşan yeni liste oluşturur.	sayilar.distinct()
 */