wszystkie algorytmy sortowania rozpatrywane w złożoności obliczeniowej + aspekt niefunkcjonalny

czy wiemy że będziemy sortowali:
 - dane posortowane, 
 - dane źle posortowane
 - czy robimy w wątkach
 - dla tablic dobre są swapy wstawianie kosztowne, dla list odwrotnie
 
 Quicksort (zazwyczaj najlepszy) i sortowanie bąbelkowe (najmniej kodu)
 
 Sortowanie bąbelkowe - porównujemy kolejne pary i jeśli jest większy to przestawiamy do końca tablicy 
 - O(n^2) 
 - uproszczenie przez wyjęcie ostatniego O(n^2/2)
 - trochę zależny od danych z powodu swapów - warianty pesymistyczny i optymistyczny
 
 Koszty operacji:
 
 _1_ `x =`
 _3_ `x + y`
 _9_ `x * y` `x / y`
 _20_ f()
 
 Porównanie - koszt N
 Swapowanie - tmp = A; A = B; B = tmp 

Bąbelkowe do 10 000 liczb - 10^8
