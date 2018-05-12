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

