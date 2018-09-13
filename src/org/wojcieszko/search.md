# wyszukiwanie 
- do wyszykiwania musi być spełnione comparable

wyszukiwanie liniowe O(n)

można zastosować funkcję hashującą do optymalizacji

hash = int

każdy obiekt w java ma funkcję hash - hash nie musi być jednoznaczny

jeżeli hashkody są różne to obiekty są różne, jeśli są takie same istnieje możliwość że są takie same

powinna mieć równomierny rozkład - żeby się hashe nie powtarzały

jak atrybuty są nieuporządkowane - użycie funkcji przemiennej dla atrybutów - dodawanie, lepszy xor,
żeby były równe mimo że w innej kolejności

można wykorzystać końcówkę hasha jako hash - więcej kolizji

equals i clone - deep equals i deep clone

__jeżeli będziemy wykorrzystywać często wyszukiwania, a głębokie porównanie jest kosztowne przy tworzeniu node warto zrobić hash - trzeba pamiętać, żeby zmieniając coś go przeliczyć__

można wykorzystać bardziej złożoną strunturę:
referencję do obiektu który zawiera hash i dane
klasę intruzywną, która zawiera hash i dane - mniej gałęzi ale hash do preliczania przy usuwaniu

