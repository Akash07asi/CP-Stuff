import java.util.*;

public class diffDivisor{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Long> primes = new ArrayList<>();
		for (long i = 2; i <= 100000; i++) { 
			boolean isPrime = true;
			for (long j = 2; j * j <= i; j++) { 
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				primes.add(i);
			}
		}

		int t = scanner.nextInt();

		while (t-- > 0) { // O(3000)
			long d = scanner.nextLong();

			long p = -1;
			for (long prime : primes) { // O(9000)
				if (prime >= (1 + d)) {
					p = prime;
					break;
				}
			}

			long q = -1;
			for (long prime : primes) { // O(9000)
				if (prime >= (p + d)) {
					q = prime;
					break;
				}
			}

			long a = Math.min(p * p * p, p * q);
			System.out.println(a);
		}
	}

}
