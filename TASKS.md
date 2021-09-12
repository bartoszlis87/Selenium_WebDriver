#Zadania

##Task01

Przygotuj test, który wyszuka inną frazę "Najlesze miejsca w Lublinie" w wyszukiwarce Google.

##Task02

rzygotuj skrypt, który będzie przechodził pomiędzy kolejnymi stronami (nie klikamy żadnych elementów na tych stronach):

https://coderslab.pl/pl
https://prod-kurs.coderslab.pl/index.php
https://qloapps.coderslab.pl/en/

##Task03

Przygotuj następującą sekwencję poruszania się po stronach z wykorzystaniem powyższych metod:

1. Wejdź na stronę: https://www.google.com
2. Wejdź na stronę: https://coderslab.pl/pl
3. Cofnij się do strony: https://www.google.com
4. Wejdź na stronę: https://prod-kurs.coderslab.pl/index.php
5. Cofnij się do strony: https://www.google.com
6. Powróć do strony: https://prod-kurs.coderslab.pl/index.php
7. Odśwież stronę: https://prod-kurs.coderslab.pl/index.php

##Task04

Zadanie 1 - By.id
Wyszukaj elementy za pomocą lokalizatora by.id
Wyszukaj elementy za pomocą lokalizatora by.id
Na stronie https://qloapps.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski za pomocą lokalizatora by.id:

(pole tekstowe) Hotel Location
(przycisk) Search Now
(pole tekstowe) Enter your e-mail (pole na dole stron)
Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:

Hotel Location - Lublin
Enter your e-mail - test@test.com
Użyj metody sendKeys

##Task05

Wyszukaj elementy za pomocą lokalizatora by.name
Na stronie https://qloapps.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski za pomocą lokalizatora by.id:


(pole tekstowe) Hotel Location
(przycisk) Search Now
(pole tekstowe) Enter your e-mail (pole na dole stron)
(przycisk) Subscribe
Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:

Hotel Location - Warsaw
Enter your e-mail - test@test.com
Dodatkowo kliknij przycisk Serach Now, używając metody Submit


##Task06

Wyszukaj elementy za pomocą lokalizatora by.className
Na stronie https://qloapps.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski za pomocą lokalizatora by.id:


(przycisk) Sign In
(pole tekstowe) Email address
Po zidentyfikowaniu elementów kliknij przycisk Sign In i wpisz dowolny adres e-mail w pole Email address.

Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku Create an account (nie musi być z wykorzystaniem lokalizatora by.className)

##Task07

Wyszukaj elementy za pomocą lokalizatora by.xpath
Będą na stronie rejestracji nowego użytkownika (patrz zadanie 3), wyszukaj za pomocą lokalizatorów xpath wszystkie wymagane pola tekstowe oraz wypełnij je dowolnymi danymi:

First Name
Last Name
Email
Password
Kliknij przycisk Register, który również wyszukaj przy pomocy lokalizatora by.xpath.

##Task08

Wyszukaj elementy za pomocą lokalizatora by.cssSelector
Po utworzeniu konta na stronie https://qloapps.coderslab.pl/en zidentyfikuj następujące pola korzystając z lokalizatora by.cssSelector:

MY PERSONAL INFORMATION
MY ADDRESSES

