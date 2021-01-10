Kody tworzone podczas zajęć z programowania w KOTLINIE

// 1) Wystawianie oceny

fun main(args:Array<String>) {
    print("Ile procent zdobył student?")
    var procenty: Int = readLine()!!.toInt()
    when(procenty){
        in 91 .. 100 -> println("Zdobyta przez studenta ocena to 5.0")
        in 81 .. 90 -> println("Zdobyta przez studenta ocena to 4.5")
        in 71 .. 80 -> println("Zdobyta przez studenta ocena to 4.0")
        in 61 .. 70 -> println("Zdobyta przez studenta ocena to 3.5")
        in 51 .. 60 -> println("Zdobyta przez studenta ocena to 3.0")
        in 50 downTo 0 -> println("Student nie zdał")
        else -> println("Nie wiem o co chodzi")
    }
}

// 2) Randomowy ciąg geometryczny

fun main(args: Array<String>) {
    val minimum : Int=0
    val maximum : Int=100
    var suma = 0.0
    var an = 0.0
    var a1 = (Math.random()*((maximum-minimum))+minimum)
    val r = (Math.random()*((maximum-minimum))+minimum)

    println("Kolejne wartości dla ciągu geometrycznego zaczynającego się od $a1 i z r o wartości $r to: ")

    val tablica : Array<Int> = (Array(10, { n -> n *1}))

    for (n : Int in 1..tablica.size){
        an  = a1 + (n - 1) *r
        println(an)
        suma += an
    }
    println("A suma tego ciągu jest równa $suma")
}

// 3) Tablica randomowych wartości

fun main(args: Array<String>) {
    println("Twoja tablica 50 randomowych wartości")
    println("////////////////////////////////////////////////////////////////////")
    val minimum=0
    val maximum=100
    val tablica : Array<Double> = Array(50, {Math.random()*((maximum-minimum))+minimum})
    for (i in 0..tablica.size-1){
        println(tablica[i])
    }
    println("////////////////////////////////////////////////////////////////////")
    println("Kilka dodatowych informacji :)")
    print("Minimalna wartość tablicy to: ")
    println(tablica.min())
    print("A jej indeks w tablicy to: ")
    println(tablica.indexOf(tablica.min()))
    print("Maxymalna wartość tablicy to: ")
    println(tablica.max())
    print("A jej indeks w tablicy to: ")
    println(tablica.indexOf(tablica.max()))
    print("Średnia wartość tablicowa to: ")
    println(tablica.average())
    val SO = kalkulatorSO(tablica)
    print("Odchylenie standardowe to: ")
    println(SO)
    println("////////////////////////////////////////////////////////////////////")

    var odwrotnie = tablica.reversedArray()
    println("A tutaj w odrotniej kolejości")
    for (i in 0.. odwrotnie.size-1){
        println(odwrotnie[i])
    }
    println("////////////////////////////////////////////////////////////////////")
}

fun kalkulatorSO(tablica: Array<Double>): Double {
    var suma= 0.0
    var StandOdch = 0.0

    for(liczba in tablica){
        suma += liczba
    }
    val srednia = suma / (tablica.size)

    for (liczba in tablica){
        StandOdch += Math.pow(liczba - srednia, 2.0)
    }
    return Math.sqrt(StandOdch/ tablica.size)
}

// 4) Zamiana indeksów między tablicami

fun main(args: Array<String>) {
    var tablica = arrayOf(2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Twoja tablica to : 2, 3, 4, 5, 6, 7, 8, 9, 10")
    println("Które elementy chcesz ze sobą zamienić według indeksów (zaczynając od 0)? ")
    println("Pierwszy indeks to: ")
    var x = (readLine()!!.toInt())
    println("drugi indeks to: ")
    var y:Int = (readLine()!!.toInt())
    run {var temp =tablica[x]; tablica[x]=tablica[y]; tablica[y] =temp}
    println()
    println("Nowa kolejność w tablicy to: ")
    for (i in 0..tablica.size-1){
        println(tablica[i])
    }
}

// 5) Wielomiany

fun main(args: Array<String>) {

    var n = 65
    var m = 65
    var o =0

    println("Najwyższa potęga x w pierwszym wielomianie to: ")
    var x = (readLine()!!.toInt())
    println(" Podaj liczby pierwszego wielomianu stojące przy x dla wielomianu w postaci: Ax^0 + Bx^1 + ...  + Nx^n")
    val tablicaA = Array((x+1), { i -> i * 1 })
    for (i in 0..tablicaA.size-1) {
        print("Podaj ${n.toChar()}")
        tablicaA[i] = (readLine()!!.toInt())
        n += 1
    }
    println("Najwyższa potęga x w drugim wielomianie to: ")
    var y = (readLine()!!.toInt())
    println(" Podaj liczby drugiego wielomianu stojące przy x dla wielomianu w postaci: Ax^0 + Bx^1 + ...  + Nx^n")
    val tablicaB = Array((y+1), { j -> j * 1 })
    for (j in 0..tablicaB.size-1) {
        print("Podaj ${m.toChar()}")
        tablicaB[j] = (readLine()!!.toInt())
        m += 1
    }
    val q = x + y
    val tablicaC = Array((q+2), {k -> k*1})

    /*
    for (i in 0..tablicaA.size - 1) {
        print("Współczynniki w pierwszym wielomianie to:")
        println(tablicaA[i])
    }
    for (j in 0..tablicaB.size - 1) {
        print("Współczynniki w drugim wielomianie to:")
        println(tablicaB[j])
    }

     */

    for (k in 0..tablicaC.size-2){
        tablicaC[k] = 0
    }


    for (i in 0..tablicaA.size-1){
        for (j in 0.. tablicaB.size-1){
            tablicaC[i+j] += tablicaA[i]*tablicaB[j]
        }
    }

    println("Wielomian powstały po przemnożeniu dwóch wielomianów podanych przez Ciebie ma współczynniki równe: ")
    for (k in 0..tablicaC.size-2) {
        print(tablicaC[k])
        print("x^")
        println(o)
        o+=1
    }
}

// 6) Działanie na tablicach

fun array(tab1: Array<String>, tab2: Array<String>, k: Int, l: Int) {
    println()
    run {var temp =tab1[(k-1)]; tab1[(k-1)]=tab2[(l-1)]; tab2[(l-1)] =temp}
    print("Pierwsza tablica po zmianie to |")
    for (i in 0..tab1.size-1){
        print(tab1[i])
        print("|")}
    println()
    print("Druga tablica po zmianie to |")
    for (j in 0..tab2.size-1){
        print(tab2[j])
        print("|")}
    println()
}

fun main(args: Array<String>) {
    print("Pierwsza tablica to (argumenty oddziel przecinkami)")
    var tab1 = readLine()!!.split(",").toTypedArray()
    print("Twoja tablica to |")
    for (i in 0..tab1.size - 1) {
        print(tab1[i])
        print("|")
    }
    var sumarg1 = tab1.size
    print(" i posiada ona $sumarg1 ")
    when (sumarg1){
        1 -> println(" argument")
        2,3,4 -> println(" argumenty")
        else -> println(" argumentów")
    }
    print("Druga tablica to (argumenty oddziel przecinkami)")
    var tab2 = readLine()!!.split(",").toTypedArray()
    print("Twoja tablica to |")
    for (j in 0..tab2.size - 1) {
        print(tab2[j])
        print("|")
    }
    var sumarg2 = tab2.size
    print(" i posiada ona $sumarg2 ")
    when (sumarg2){
        1 -> println(" argument")
        2,3,4 -> println(" argumenty")
        else -> println(" argumentów")
    }
    print("Indeks pierwszej tablicy który chcesz zamienić to ")
    var k = (readLine()!!.toInt())
    while (k > tab1.size) {
        println("Wartość jest większa niż tablica - wyskoczy błąd")
        print("Podaj ponownie")
        k = (readLine()!!.toInt())}
    print("Indeks drugiej tablicy który chcesz zamienić to ")
    var l = (readLine()!!.toInt())
    while (l > tab2.size) {
        println("Wartość jest większa niż tablica - wyskoczy błąd")
        print("Podaj ponownie")
        l = (readLine()!!.toInt())}
    var result = array(tab1, tab2, k, l)
    println(result)
}

// 7) Tworzenie trójkąta

fun triangle(a:Int, b:Int, c:Int) : Boolean {
    if (((a+b)> c) && ((b+c)>a) && ((a+c)>b)) return true
    else return false
}

fun main(args: Array<String>){
    println("Czy umiesz zbudować trójką? Podaj boki, a ja ci powiem czy tak.")
    println("Jeżeli będzie możliwość stworzenia trójkąta- odpowiem ci TRUE, jeżeli nie to FALSE")
    print("Pierwszy boczek to ")
    var a: Int = (readLine()!!.toInt())
    print("Drugi boczek to ")
    var b: Int= (readLine()!!.toInt())
    print("Trzeci boczek to ")
    var c: Int= (readLine()!!.toInt())
    var result = triangle(a,b,c)
    print (result)
}

// 8) Lotto

fun lotto(m: Int, n: Int) {
    var tablica : MutableList<Int> = MutableList(n+1, {z -> z*1} )
    tablica.remove(0)
    tablica.shuffle()
    print("|")
    for (i in 0..(m-1)){
        print(tablica[i])
        print("|")
    }
    println()
}

fun main(args: Array<String>) {
    print("Jak wiele liczb ma być wylosowanych?")
    var m = (readLine()!!.toInt())
    print("Zakres losowanych liczb jest od 1 do ")
    var n = (readLine()!!.toInt())
    var tab = lotto(m, n)
    print(tab)
}

// 9) Symulator rzutów kostką

fun dice(kostka:Int) {
    val minimum=1
    val maximum=7
    var ilerazy : MutableList<Int> = MutableList(6, {z -> 0})
    for (i in 0..(kostka-1)){
        var i =(Math.random()*((maximum-minimum))+minimum)
        when (i.toInt()) {
            1 -> ilerazy[0]+=1
            2 -> ilerazy[1]+=1
            3 -> ilerazy[2]+=1
            4 -> ilerazy[3]+=1
            5 -> ilerazy[4]+=1
            6 -> ilerazy[5]+=1
        }
    }
    print("|")
    for (i in 0..ilerazy.size-1){
        print(ilerazy[i])
        print("|")
    }
}

fun main(args: Array<String>) {
    print("Ile razy chciałbyś rzucić kostką? ")
    var kostka = readLine()!!.toInt()
    println("Przeprowadze dla ciebie symulacje $kostka rzutów kostką. Ciekawy częstotliwości danych liczb? To proszę!")
    var tab  = dice(kostka)
    print(tab)
}

// 10) Zliczanie samogłosek

fun vowels(slowa1: CharArray) {
    var samog = 0.0
    for (i in 0..slowa1.size-1){
        when (slowa1[i]){
            'a' -> samog += 1
            'ą' -> samog += 1
            'e' -> samog += 1
            'ę' -> samog += 1
            'i' -> samog += 1
            'o' -> samog += 1
            'ó' -> samog += 1
            'u' -> samog += 1
            'y' -> samog += 1
        }
    }
    print ("W podanym wyrażeniu mamy ")
    print (samog.toInt())
    when (samog.toInt()){
        1 -> print(" samogłoskę")
        2,3,4 -> print(" samogłoski")
        else -> print(" samogłosek")}
    println()

}

fun main(args: Array<String>) {
    print("Podaj wyrażenie w którym mam zliczyć samogłoski: ")
    var slowa= readLine()!!.toLowerCase()
    var slowa1 =slowa.toCharArray()
    var wynik = vowels(slowa1)
    print(wynik)
}