package org.example;

import java.util.Scanner;

public class VoteSystem {
    public static void main(String[] args) {

        VoteSystem voteSystem = new VoteSystem();
        Candidate candidate = voteSystem.new Candidate();

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("-------------------******************************--------------------");
            System.out.println("-------------------- WElCOME --------------------");
            System.out.println("Please enter your name: ");
            String userName = input.nextLine();

            System.out.println("-------------------******************************--------------------");
            System.out.println("Please enter your age: ");
            int userAge = input.nextInt();

            if (userAge >= 18) {
                System.out.println("Please select a candidate ");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");

                int userSelection = input.nextInt();

                if (userSelection == 1) {
                    Candidate.setCandidate1Votes();
                    Candidate.showTotalVoteResult1();
                } else if (userSelection == 2) {
                    Candidate.setCandidate2Votes();
                    Candidate.showTotalVoteResult2();
                }

                System.out.println("----------------------------------------------------------------------");
                System.out.println("Thank you for voting, " + userName);

            } else {
                System.out.println("Sorry, you are not eligible to vote. Thank you!");
            }
        } while (1 != 0); // try logical and or
    }

    class Candidate {
        static int candidate1Votes = 0;
        static int candidate2Votes = 0;

        private static void setCandidate1Votes() {
            candidate1Votes++;
            System.out.println("-------------------******************************--------------------");
            System.out.println("Candidate 1: " + candidate1Votes +  " votes");

        }

        private static void setCandidate2Votes() {
            candidate2Votes++;
            System.out.println("-------------------******************************--------------------");
            System.out.println("Candidate 2: " + candidate2Votes + " votes");
        }

        private static int totalVote1 = 0;
        private static int totalVote2 = 0;

        public static void showTotalVoteResult1() {
            totalVote1 += candidate1Votes;
            totalVote1++;
            System.out.println("-------------------******************************--------------------");
            System.out.println("Total votes for Candidate 1 is now: " + candidate1Votes + " vote(s)");

        }

        public static void showTotalVoteResult2() {
            totalVote2 += candidate2Votes;
            totalVote2++;
            System.out.println("-------------------******************************--------------------");
            System.out.println("Total votes for Candidate 1 is now: " + candidate2Votes + " vote(s)");
        }
    }
}