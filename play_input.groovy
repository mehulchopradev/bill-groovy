println 'Program starts...'

def scanner = new Scanner(System.in)

while(true) {
    print 'Enter a number: '
    try {
        def n = scanner.nextInt()
        println(n % 2 ? 'Odd' : 'Even')
        break
    } catch (InputMismatchException e) {
        println "hey please enter integer values only"
        scanner.nextLine() // empties the scanner
    } catch (Exception e) {
        println "Something went wrong"
    }
}

println 'Program ends'