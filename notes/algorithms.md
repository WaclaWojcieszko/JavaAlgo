#Listy

- węzły i krawędzie
- określona maksymalna liczba wychodzących strzałek
-

###SingleLinkedList [SLL]

- węzeł jest klasą, która trzyma dane
- połączone pojedynczymi strzałkami

- potrzebna jest klasa sterująca z metodami - SingleLinkedList
- klasa nadzorcza łączy się z danymi przez uchwyt - handle

Dygresja - strażnik sentinel - w javie null pointer jest strażnikiem

- nie zabijaj sentinela - nie przekształcać danych na sentinela - np przy decrement.


    lista jest pewną formą grafu - różnią się tym od grafów tym, że w listach istnieje porządek
    
DoubleLinkedList - jest wtedy jak lista zawiera 2 przeciwne porządki - do przodu i do tyłu

referencji może być wiele zmieniając porządek sortowania listy - kolejność dodania (techniczna) 

SLL - 1 krawędź
    - łatwa
    - mało 

    - niecofalna
    
DLL - head, tail??
    - chodzi w dwóch kierunkach
    - można zacząć gdziekolwiek   
 
 
 Metryki kodu:
 - liczba linijek kodu
 - liczba `if` - z niej wynika liczba potrzebych unitestów
 
 operacje:
- append
- insert
- delete
- find
    
 Wady SLL:
 - są nieciągłe
    - wyszukiwanie O(n)
    - insert O(1)
- tylko insert after bo nie można się dowiedzieć kto do tego miejsca kierował

Przewaga nad tabelą - nie potrzebuje ciągłej pamięci
Ułomność - dużo obiektów z odniesieniami, może zabraknąć pamięci

Lista odporna na wątki jest do wykonania bardzo trudna 
- musi blokować fragment na którym robi się operacje - jak roboty drogowe - wcześniej możesz, ale dalej po niej nie powędrujesz

DO DOMU:
) head2Tail z listą robi:

A B _C_ D E F

D E F A B _C_

commit push
www: pull request LIST -> MASTER + @jbanaszczyk

## Array

często wykorzystuje się listy jako przygotowanie tablicy jeśli potrzeba dużo operacji i zmian do utworzenia tabeli

Resize - trzeba wykorzystać - zabezpieczyć więcej miejsca

przesuwa się od tylu:
koszt O(n) for... 
a[i] = a[i-1]
+ ukryty koszt - java sprawdza zawsze czy się mieści w granicy tabeli < > koszt*5

Arrays.copyArray(source, destination, counter)


## Generator liczb losowych

liczby losowe nie są losowe - do włamań - jeśli znajdzie się cykl można np. podszyć sie pod sesję następnego

ocena liczb losowych - pod kątem statystycznym - czy są szumem białym, jak sa rozłożone

generowanie współcześnie dla dowolnego rozkładu

dawniej liniowy int

pseudo i true random generator - PRNG i TRNG (można kupić - używają go wielkie instytuty);

kongruencyjny (reszta z dzielenia) generator liniowy - kongruencja sumy to suma kongruencji
(Ax + B) % C - liczby z zakresu 0-C
metody #ujące w kryptografii

nie używać rozkładów z rozkładów.

