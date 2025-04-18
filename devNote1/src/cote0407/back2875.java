package src.cote0407;

import java.util.Scanner;

public class back2875 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        // 팀을 최대 몇 개 만들 수 있는가? (여학생 2명 + 남학생 1명)
        int team = Math.min(N / 2, M);

        // 인턴 K명을 보내기 위해 남는 인원이 K명 이상이어야 함
        while ((N + M - team * 3) < K) {
            team--; // 한 팀 줄이기
        }

        System.out.println(team);
    }
}
