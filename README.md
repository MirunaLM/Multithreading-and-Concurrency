# Multithreading-and-Concurrency
Sa se determine toate numerele prime din intervalul [1, n] folosinf k fire.Fie n = kq + r unde 0 <= r < k unde r este restul impartirii lui n la k.Se vor considera 2 solutii:

- Se partitioneaza intervalul [1, n] in k intervale astfel I1 = [1, q + 1], I2 = [q + 2, 2q + 2] ,..., Ik = [(k - 1)q + r + 1, kq + r].Fiecare fir 1 <= j <= k va determina numerele prime din intervalul Ij.

- Multiplii lui k + 1 stric mai mari ca k + 1 nu sunt numere prime.Se elimina aceste numere din intervalul [1, n] rezultand multimea M.Aceasta multime se partitioneaza in k submultimi astfel: pentru fiecare 1 <= j <= k multimea Mj contine acele elemente din M care dau restul j la impartirea prin k + 1.Totodata se considera ca k + 1 apartine lui M1.Fiecare fir j va determina numerele prime din multimea Mj.
