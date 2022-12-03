public class Dialog {
    public static String intro() {
        String i1 = "You are in a land full of dragons. Due to unforeseen circumstances,";
        String i2 = "the king, Yggdrasil offers you the choice of prison, or slaying the dragon that plagues the land.";
        String i3 = "\"Should you succeed, your crimes will be forgotten. Otherwise, YOU will be forgotten.\"";
        String i4 = "Will you risk your life to QUEST for the chance of freedom?";
        String i5 = "Or go spend the rest of your days in PRISON.";
        String i6 = "Type your choice, or enter help";
        return i1 +"\n"+ i2 +"\n"+ i3 +"\n"+ i4 +"\n"+ i5 +"\n"+ i6;
    }

    public static String prison() {
        String i1 = "\"Sire! I'm way too much of a wuss to accept this quest!\" You say.";
        String i2 = "Looking at you with wonder, the king says, \"Oh... well okay, send him to prison then.\"";
        String i3 = "You spend the rest of your days in a dark damp prison cell.";
        String i4 = "\"I totally could've accepted the quest and run off...\" You think to yourself.";
        String i5 = "After 5 years you befriend a rat whom you named Jeffrey";
        String i6 = "Jeffrey becomes your lifelong friend until 2 weeks later, when the guards forgot to bring you food for 3 days.";
        String i7 = "You ate Jeffrey to stave off starvation";
        String i8 = "It wasn't until this time did you realize Jeffrey was a plague rat. You die of bubonic plague 3 weeks later...";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8;
    }

    public static String quest() {
        String i1 = "\"Sire! I happen to be the manliest man alive! I WILL KILL THE DRAGON!!!\" You say.";
        String i2 = "The king looks at you with admiration, the king says, \"Get this man some equipment!\"";
        String i3 = "The kings men suit you in armor, give you a sword, a horse, and other things you'd need in your journey.";
        String i4 = "You are given obligatory lessons in minor alchemy, mathematics, wizardry and home economics.";
        String i5 = "You are finally ready to start your journey.";
        String i6 = "\"The dragon lives on the top of mount Kryzaen'Boor.\" The guard says.";
        String i7 = "\"He is a trickster, and may have laid traps and puzzles to the entrance of his cave.\" Says another.";
        String i8 = "You set out on a cool September morning, ready to face the dragon";
        //String i9 = "Press ENTER to continue...";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8/* + "\n" + i9*/;
    }

    public static String journey() {
        String i1 = "After 11 days of riding, your butt is sore, you smell worse than your horse, and you feel like you could sleep for a month.";
        String i2 = "But with the mountain standing tall before you, all you can think is \"This is where the hard part starts.\"";
        String i3 = "It's about 6 in the evening. The top of the mountain is covered by clouds. You decide to rest for the night.";
        String i4 = ".\nYou wake up suddenly, you can hear a kind of shuffling dragging noise.";
        String i5 = "You're not sure what, if anything, is out there.";
        String i6 = "\"Should i go INVESTIGATE? Or should I IGNORE it and go back to sleep? I have a long day tomorrow.\" You think.";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6;
    }

    public static String investigate() {
        String i1 = "You creep out of your tent, in the darkness you see something that you've never heard of before.";
        String i2 = "It's some type of dog sized creature. Devoid of eyes, the only facial features you could make out was a hole filled with sharp teeth.";
        String i3 = "instead of legs, it had many tentacles. you saw it prodding your bag.";
        String i4 = "You draw your sword and take a swing at its head.";
        String i5 = "its tentacles wriggling, its head topples to the ground";
        String i6 = "\"It's a good thing i checked, that thing could've made off with all my supplies.\"";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6;
    }

    public static String ignore() {
        String i1 = "\"It's probably just the wind, or my horse moving around.\" You think to yourself";
        String i2 = "You go back to sleep.";
        String i3 = "Waking up in the morning, you go out to find that your supplies are scattered all over the place.";
        String i4 = "A decent bit of your rations are missing also.";
        String i5 = "\"Great......\" You say to yourself. \"I really should've checked what that noise was.\"";
        String i6 = "After taking stock you see you still have enough to complete your journey if you eat leaner meals.";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6;
    }

    public static String mountain() {
        String i1 = ".\nYou're at the mountain.";
        String i2 = "You start making your way up a small path";
        String i3 = "You see 3 paths in front of you, one going LEFT, one RIGHT, and the other STRAIGHT.";
        return i1 + "\n" + i2 + "\n" + i3;
    }

    public static String left() {
        String i1 = "You go down the path to the left.";
        String i2 = "After walking for a minute, the path drops off.";
        String i3 = "Seeing, it's impossible, you turn back. You'll have to take the STRAIGHT or RIGHT path.";
        return i1 + "\n" + i2 + "\n" + i3;
    }

    public static String right() {
        String i1 = "You go up the path to the right.";
        String i2 = "This path seems a bit easier to climb.";
        String i3 = "You notice a skeleton off the path, he appears to be clutching something.";
        String i4 = "You investigate and find him holding a beautiful sword.";
        String i5 = "You recognize it from one of your textbooks, it is the fabled Dragon's Fang Blade.";
        String i6 = "It's told to be fatal to dragons with even one cut, due to the toxic nature of the metal it's made from.";
        String i7 = "You keep going until you reach the mouth of the cave. The air is foul.";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7;
    }

    public static String straight() {
        String i1 = "You go straight and continue to traverse your way up the mountain.";
        String i2 = "After a long time of climbing you start to notice a foul odor.";
        String i3 = "You have arrived at the entrance to the cave...";
        return i1 + "\n" + i2 + "\n" + i3;
    }

    public static String caveMouth() {
        String i1 = ".\nYou see a circular door.";
        String i2 = "A tablet with the numbers one through 10 next to it.";
        String i3 = "There is an inscription that reads:";
        String i4 = "WHAT'S THE KEY TO LEARNING THE SIZE OF THE WORLD?";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4;
    }

    public static String puzzleOneWin() {
        String i1 = "You hear some machinery moving";
        String i2 = "The door rolls out of the way, revealing another door and an apothecary table with a bowl";
        String i3 = "you see vials of POISON, MILK, WATER, GRAIN, GOLD, and HERBS";
        String i4 = "There is an inscription that reads:";
        String i5 = "MANY SEEK IT, WITHOUT IT LIFE IS IMPOSSIBLE, AND WITH TOO MUCH LIFE IS LOST";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5;
    }

    public static String puzzleTwoWin() {
        String i1 = "You hear some machinery moving";
        String i2 = "The door rolls out of the way, the cave is open.";
        String i3 = "You enter, once deeper in the cave you see the dragon.";
        String i4 = "Thankfully he's asleep.";
        String i5 = "There is gold all around. you'll have to be careful not to wake him up.";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5;
    }

    public static String insideCaveStraightPath() {
        String i1 = ".\nYou start making your way towards him, your sword drawn.";
        String i2 = "You creep up to his head and ready a blow.";
        String i3 = "You bring down the sword and with a loud clatter, it bounces off his tough scales";
        String i4 = "He wakes up and pins you against the wall.";
        String i5 = "With a snarl and a deep voice he says,";
        String i6 = "\"I suppose king Yggdrasil sent you, hmm? He's been trying to steal my treasure for years.\"";
        String i7 = "\"I'll have you know that I have done nothing to warrant extermination, he learned about my cave and desires the riches it contains\"";
        String i8 = "\"He's sent many to try and slay me, all have failed.\"";
        String i9 = "As the dragon opens his mouth, you realize this is the end unless you do something.";
        String i10 = "Should you PLEAD for your life? Or make a sarcastic COMMENT?";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8 + "\n" + i9 + "\n" + i10;
    }

    public static String insideCaveRightPath() {
        String i1 = ".\nYou start making your way towards him, your sword drawn.";
        String i2 = "You creep up to his head and ready a blow.";
        String i3 = "You bring down the sword and it cleanly cuts him.";
        String i4 = "You hoped to decapitate him but you know he will soon be dead from the cut.";
        String i5 = "With a snarl and a deep voice he says,";
        String i6 = "\"WHAT IS THIS?!\" He stumbles around a bit \"IF I AM TO DIE THERE IS SOMETHING YOU SHOULD KNOW!!!\"";
        String i7 = "\"THERE IS AN ARTIFACT IN THIS CHEST\"-he gestures-\"THAT WILL ALLOW YOU TO CONTROL THE WILL OF ANY MAN!\"";
        String i8 = "\"YOUR KING HAS BEEN TRYING TO STEAL IT FROM ME FOR YEARS, HE SEEKS TO RULE THE WORLD!\"";
        String i9 = "The dragon writhes a bit and his last breath escapes him.";
        String i10 = "Look in the chest, inside there's an amulet. Should you GIVE it to the king? or TAKE it for yourself?";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8 + "\n" + i9 + "\n" + i10;
    }

    public static String plead() {
        String i1 = "\"PLEASE!! I ONLY CAME HERE TO STAY OUT OF PRISON!!!\"";
        String i2 = "The dragon recoils, \"So you aren't one of the kings champions?\"";
        String i3 = "\"NO!!! I WAS CAUGHT TRYING TO BREAK MY FAMILY OUT OF PRISON, I ONLY CAME HERE TO TRY AND STAY OUT!\"";
        String i4 = "The dragon seemed to contemplate this for a moment.";
        String i5 = "\"Your king seeks an amulet that would allow him to control the free will of humans. he wants to rule the world.\"";
        String i6 = "\"As I am not human, I was chosen to guard it, so i could neither be tempted to use the amulet nor have it used against me.\"";
        String i7 = "\"I will spare you if you agree to help me\"";
        String i8 = "As your only alternative is death, you ask. \"How?\"";
        String i9 = "\"Take the amulet, return to your kingdom, use its power to remove the evil king from power. I will then return the amulet to safety\"";
        String i10 = "Do you ACCEPT his terms, or REJECT them?";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8 + "\n" + i9 + "\n" + i10;
    }

    public static String comment() {
        String i1 = "\"I KNEW I SHOULD'VE CHOSEN PRISON!!!\"";
        String i2 = "The dragon recoils, \"So you aren't one of the kings champions?\"";
        String i3 = "\"NO!!! I WAS CAUGHT TRYING TO BREAK MY FAMILY OUT OF PRISON, I ONLY CAME HERE TO TRY AND STAY OUT!\"";
        String i4 = "The dragon seemed to contemplate this for a moment.";
        String i5 = "\"Your king seeks an amulet that would allow him to control the free will of humans. he wants to rule the world.\"";
        String i6 = "\"As I am not human, I was chosen to guard it, so i could neither be tempted to use the amulet nor have it used against me.\"";
        String i7 = "\"I will spare you if you agree to help me\"";
        String i8 = "As your only alternative is death, you ask. \"How?\"";
        String i9 = "\"Take the amulet, return to your kingdom, use its power to remove the evil king from power. I will then return the amulet to safety\"";
        String i10 = "Do you ACCEPT his terms, or REJECT them?";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8 + "\n" + i9 + "\n" + i10;
    }

    public static String give() {
        String i1 = "You bring the amulet back to the king.";
        String i2 = "He puts it on and as a test of its power tells you to take some poison from his hand.";
        String i3 = "You do so.";
        String i4 = "\"Drink it.\" He says.";
        String i5 = "Despite your attempt to resist you do as he says.";
        String i6 = "As you lay dying he laughs.";
        String i7 = "\"Prepare my horse! I think I fancy a visit to the neighboring kingdoms.\"";
        String i8 = "GAME OVER!";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8;
    }

    public static String take() {
        String i1 = "You return to the king.";
        String i2 = "\"I didn't think you'd return, the dragon is slain then?\" He says.";
        String i3 = "\"Yes... There are great riches there.\" You respond.";
        String i4 = "\"Indeed I've heard such tales, I shall prepare a caravan, we can go there with you as our guide, I will see to it you get a fair share.\"";
        String i5 = "\"Actually.\" You interrupt, taking the amulet out of your pocket. \"I think you should sit down.\"";
        String i6 = "The king has a look of horror on his face, He sits.";
        String i7 = "\"Now, I think there's some changes to be made about here...\" You hand him the sword he gave you.";
        String i8 = "\"Turn the blade towards your heart.\" He does.";
        String i9 = "\"Now fall on it..\"";
        String i10 = "The king follows your command, killing himself.";
        String i11 = "\"It's time for a new king to rule\" you sit on the throne, the guards kneel, knowing theres nothing they can do.";
        String i12 = "\"I think I should visit with some of our rival kings. we should talk about...... Peace..\"";
        String i13 = "THE END!";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8 + "\n" + i9 + "\n" + i10 + "\n" + i11 + "\n" + i12 + "\n" + i13;
    }

    public static String reject() {
        String i1 = "\"I will NEVER join you!!!\" You yell.";
        String i2 = "\"What a shame\" He says. \"I hoped you would help rid the world of the real evil.\"";
        String i3 = "The dragon opens his mouth, and with one quick bite he devours you whole";
        return i1 + "\n" + i2 + "\n" + i3;
    }
    public static String accept() {
        String i1 = "\"I will help you\" You say.";
        String i2 = "\"Smart boy.\" He says. \"Get on my back, we will fly to the castle\"";
        String i3 = "You fly back, landing outside the castle you run in, donning the amulet under your armor as you approach the king.";
        String i4 = "\"You're back much sooner than I would've expected. How'd you get back so quickly?\" The king says sounding surprised.";
        String i5 = "\"Follow me, I'll show you.\" You say, the king stands and with a horrified face -showing he knows you have the amulet - follows you.";
        String i6 = "You lead him outside, where the dragon is waiting.";
        String i7 = "\"You made a mistake sending this one for me.\" The dragon says.";
        String i8 = "The king screams in fear, and the dragon devours him.";
        String i9 = "You hand the amulet back to the dragon who says, \"you are now free to live in peace.\" He flies away.";
        String i10 = "The kings counsel - who'd been trying to overthrow him before he acquired the amulet - approach you.";
        String i11 = "\"What shall we do now, sire?\"";
        String i12 = "\nTHE END!";
        return i1 + "\n" + i2 + "\n" + i3 + "\n" + i4 + "\n" + i5 + "\n" + i6 + "\n" + i7 + "\n" + i8 + "\n" + i9 + "\n" + i10 + "\n" + i11 + "\n" + i12;
    }
}
