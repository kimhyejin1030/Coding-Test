class Solution {
    public int solution(int hp) {
        
        int general = hp / 5;
        hp = hp % 5;

        int soldier = hp / 3;
        hp = hp % 3;

        int worker = hp;
        
        return (general + soldier + worker);
    }
}