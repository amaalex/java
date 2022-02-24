## Problem Description
  - ❓ Implement an efficient algorithm
  - :heavy_check_mark: that determines, if possible, a subset of words W1,W2,...,Wk (from the ones that you have generated) such that k ≥ 3
  - :heavy_check_mark: and Wi and Wi+1 are neighbors, for all i in [1..k],
  - ❓ where Wk+1=W1.

## Cum am gândit problema:
  - fac un map și determin de câte ori apare fiecare caracter. Dacă am 3 cuvinte - AAA AAB AAC -> A - apare de 3 ori, în 3 cuvinte diferite.
  - după ce am determinat caracterul maxim, înseamnă că acela este numărul maxim de cuvinte pe care pot să-l fac
  - încerc să determin subcuvinte din cuvintele deja avute, care să conțină caracterul predominant ca să fie toți vecini între ei.
## Output
![image](https://user-images.githubusercontent.com/61457770/154835912-7b98e3c9-26aa-4322-bd5b-2ad214126b8b.png)
