//ADVISED TO PLAY IN FULL SCREEN!!!

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //System.out.println("//ADVISED TO PLAY IN FULL SCREEN!!!\n\n");
        System.out.println("DO YOU WANT TO BE MILD THOMAS JEFFERSON OR SPICY GEORGE WASHINGTON?");
        String person = scan.nextLine();
        String son = person.toUpperCase();
        
        if (son.equals("THOMAS JEFFERSON") ||  son.equals("MILD THOMAS JEFFERSON") || son.equals("JEFFERSON") || son.equals("THOMAS") || son.equals("MILD") || son.equals("MILD THOMAS"))
        {
           System.out.println("\n\nYOU HAVE CHOSEN THOMAS JEFFERSON\nTHINK ABOUT IT, WHAT ARE THE CHANCES YOU ARE THOMAS JEFFERSON?\nHint: It's an integer from 1 to 50\n\n\nWhat is your guess? (You have 5 tries)\n#1 try:");
            int guess = 0;
            int tries = 0;
            int areyou = 0;
            int ran = (int)(Math.random()*50)+1;
            int constitution = (int)(Math.random()*50)+1;

            while (tries <= 4)
            {
                guess = scan.nextInt();
                if (guess == ran)
                {
                    System.out.print("Congrats. You are right. Now you are Thomas Jefferson.");
                    if (tries == 0)
                    {
                        System.out.println(" You only took " + (tries + 1) + " try.  You look like:");
                    }
                    else 
                    {
                        System.out.println(" You only took " + (tries + 1) + " tries. You look like:");
                    }
                        System.out.println("                _____    ____");
                        System.out.println("             .#########.#######..");
                        System.out.println("          .#######################.");
                        System.out.println("        .############################.");
                        System.out.println("       .################################.");
                        System.out.println("      .#########,##,#####################.");
                        System.out.println("     .#########-#,\'########## ############.");
                        System.out.println("    .######\'#-##\' # ##\'### #. `####:#######.");
                        System.out.println("    #####:\'# #\'###,##\' # # +#. `###:\':######");
                        System.out.println("   .####,'###,##  ###  # # #`#. -####`######.");
                        System.out.println("  .####+.\' ,\'#  ##\' #   # # #`#`.`#####::####");
                        System.out.println("  ####\'    #  '##'  #   #_'# #.## `#######;##");
                        System.out.println("  #:##\'      '       #   # ``..__# `#######:#");
                        System.out.println("  #:##\'  .#######s.   #.  .s######.`#####:##");
                        System.out.println("  #:##   .\"______\"\"\'    \'\"\"_____\"\". `.#####:#");
                        System.out.println(" .#:##   ><\'(##)\'> )    ( <\'(##)`><   `####;#");
                        System.out.println(" ##:##  , , -==-\' \'.    .` `-==- . \\  ######\'");
                        System.out.println(" #|-\'| / /      ,  :    : ,       \\ ` :####:\'");
                        System.out.println(" :#  |: \'  \'   /  .     .  .  `    `  |`####");
                        System.out.println(" #|  :|   /   \'  \'       `  \\   . ,   :  #:#");
                        System.out.println(" #L. | | ,  /   `.-._ _.-.\'   .  \\ \\  : ) J##");
                        System.out.println("###\\ `  /  \'                   \\  : : |  /##");
                        System.out.println(" ## #|.:: \'       _    _        ` | | |\'####");
                        System.out.println(" #####|\\  |  (.-\'.__`-\'__.`-.)   :| \' ######");
                        System.out.println(" ######\\:      `-...___..-' '     :: /######");
                        System.out.println(" #######\\``.                   ,\'|  /#######");
                        System.out.println(".# ######\\  \\       ___       / /\' /#######");
                        System.out.println("# #\'#####|\\  \\    -     -    /  ,\'|### #. #.");
                        System.out.println("`#  #####| \\'-.`             \' ,-\'  |### #  #");
                        System.out.println("    #\' `#|    \'._         ,.-\'     #`#`#.");
                        System.out.println("         |       .\'------\' :       |#   #");
                        System.out.println("         |       :         :       |");
                        System.out.println("         |       :         :       |");
                        System.out.println("                 :         :");
                }
                else if (guess < 1 || guess > 50)
                {
                    System.out.println("You are out of range. It's a number between 1 to 50 (exclusive).");
                }
                else if (guess != ran && tries == 3)
                {
                    System.out.println("\nStill not it, THIS IS YOUR LAST CHANCE!");
                }
                else if (guess == constitution)
                {
                    System.out.println("Congrats, you have guessed the wrong number. However, you got teleported to a Constitutional Convention. You get an Amendment for free.");
                }
                else if (guess < (ran-45))
                {
                    System.out.println("Nope, you are not even close. WAYYY TOO LOW.");
                }
                else if (guess > (ran+45))
                {
                    System.out.println("Nope, you are not even close. TOO HIGH TOO HIGH.");
                }
                else if (guess < (ran-30))
                {
                    System.out.println("Nope, you are kinda far. VERY LOW.");
                }
                else if (guess > (ran+30))
                {
                    System.out.println("Nope, you are kinda far. TOO HIGH.");
                }
                else if (guess < (ran-20))
                {
                    System.out.println("Nope, not really it. TOO LOW.");
                }
                else if (guess > (ran+20))
                {
                    System.out.println("Nope, not really it. YOU WENT TOO HIGH.");
                }
                else if (guess < (ran-15))
                {
                    System.out.println("Nahhhh. YOU ARE ON THE LOW END.");
                }
                else if (guess > (ran+15))
                {
                    System.out.println("Nahhhh. GO LOWERRRR.");
                }
                else if (guess < (ran-10))
                {
                    System.out.println("NO NO NO. Not that low ok.");
                }
                else if (guess > (ran+10))
                {
                    System.out.println("NO NO NO. Go lower than that.");
                }
                else if (guess < (ran-5))
                {
                    System.out.println("Not it. Go higher.");
                }
                else if (guess > (ran+5))
                {
                    System.out.println("Not it. Go lower.");
                }
                else if (guess < (ran-3))
                {
                    System.out.println("Today\'s not your day. Go higher a bit.");
                }
                else if (guess > (ran+3))
                {
                    System.out.println("Today\'s not your day. Go lower a bit.");
                }
                else 
                {
                    System.out.println("YOU ARE MUCHO CLOSE!");
                }
                
                if (guess != ran && tries < 4)
                {
                    System.out.print("\nThis is your #" + (tries + 2) + " try. ");
                    System.out.println("Try again:");
                }
                tries ++;
                areyou = 0;
            }

                if (guess != ran && areyou == 0)
                {
                    System.out.print("Unfortunately, you are NOT Thomas Jefferson.");
                } 
        }

        if (son.equals("GEORGE WASHINGTON") ||  son.equals("SPICY GEORGE WASHINGTON") || son.equals("WASHINGTON") || son.equals("GEORGE") || son.equals("SPICY") || son.equals("SPICY GEORGE"))
        {
            System.out.println("\n\nYOU HAVE CHOSEN GEORGE WASHINGTON\nTHINK ABOUT IT, WHAT ARE THE CHANCES YOU ARE GEORGE WASHINGTON?\nHint: It's an integer from 1 to 100\n\n\nWhat is your guess? (You have 10 tries)\n#1 try:");
            int guess = 0;
            int tries = 0;
            int areyou = 0;
            int ran = (int)(Math.random()*100)+1;
            int wig = (int)(Math.random()*100)+1;

            while (tries <= 9)
            {
                guess = scan.nextInt();
                if (guess == ran)
                {
                    System.out.print("Congrats. You are right. Now you are George Washington.");
                    if (tries == 0)
                    {
                        System.out.println(" You only took " + (tries + 1) + " try.  You look like:");
                    }
                    else 
                    {
                        System.out.println(" You only took " + (tries + 1) + " tries. You look like:");
                    }
                        System.out.println("                             .::::..:::....");
                        System.out.println("                           .:\"\"\":::..::.  :::..");
                        System.out.println("                       ...::::::.     :.::: \':::");
                        System.out.println("                   ..:::::.. ..:::.  .  \'::: :\".::.");
                        System.out.println("                 .::::\" . \'\": \' .::.. \": ::\" :.. \'::");
                        System.out.println("               ..::...  \':..: .:::::::.:. :::.: \':::\":.");
                        System.out.println("            .:::::\'\"\"\":..:::::::\"\'\'  \'\'\"::..::::\'::\".:::.");
                        System.out.println("         .::::..   ::\"\"::... .            \'\"::::\"\' . \":.:.");
                        System.out.println("        .::\'\'\'\"\":: \"\"  \":..  .                \"      .\'\":.:.");
                        System.out.println("        ::::...   .::..:.. .                            \"\":.:.");
                        System.out.println("       ::::::\'\"...::\'\"..::.. . .                         . :.\".");
                        System.out.println("     .:\"\"  \':. ::\"\"\'  \':::..  .                         .  \':.\".");
                        System.out.println("    ::::   ..  ::  :::\"\':::.. .     .                  .  . \'::\':");
                        System.out.println("    :::...::::\" \' .\':\' \'::::.. .      .             .     .  ::::");
                        System.out.println("    .:::\'\"\"   \' .:::::.\':I:::.  .         .      .      .  . :\"::.");
                        System.out.println("   .\"\"\'  :::\"   ::\"\'    :II::\'     ...         .        ... .:\'\'::");
                        System.out.println("  ::.   .::\"  .:\"\'\'\':...:I::\"  :II:::IHI:..          .:::I:\'\':  \':");
                        System.out.println("  :::::. :.  .:..:.  ..:::::\'IH:::::II:::IHHI.    .HI.:IHI:\'\':. .:");
                        System.out.println(" :\"\'   \'    ..::\"\'    \":::\"IHI:IHI\"\"..\"\"::IHHI.\'  IHIH\"\'\'\':.::: \":.");
                        System.out.println(":.::\"\"    \'::\'\'  .   .::::\'IHHHHI:\":H:\':::..:I:.  HI\':H:\':..::\'\":\':");
                        System.out.println(":::  ..    ::. \'::\":.::::.I:. ::::....:..:I.IH:.  \'::.\".:.:I\":. \".\":.");
                        System.out.println("::\'\'::::\"\'  \"   :::\" :::...  . \':::\' \'\'  .:IIH:.   ::.\' :\":\" :.:   \':.");
                        System.out.println("::\'   \'   .:\"\' .::\"::::... .      .   ....::IHI.   ::\"  . \'  :. ..   :.");
                        System.out.println(":::::\"\':::\"\'  .:I.: \"::.. .             ...::II:   :I:\'      : .  \"::.\':");
                        System.out.println("\"::\". :\"\'\'  . :I :\" :I::.. .              ..::II.  \':\"       :. :: \':: ::");
                        System.out.println(" :::.. .:\' :\' :I:\'  \':I::.. .            . ..:II\"   ::       :I.\'::.:: :\'");
                        System.out.println(" \':\"\'\'\":I:.  .:I:.:: :II::... .           ::\"\"I:.   :.      .:I: \"::\"\'.:");
                        System.out.println("  :..:\"\'::::::::\'\':\'.\":II:::.. .        .::\'...I:...::.     .:I:  \'..::\"");
                        System.out.println("  \"::\' ..\"\".::\"::.\'  .:II:::... . .   ...::.\"I:::::I\". .   ...:\"   :\'");
                        System.out.println("   \':..::  .:\"::::   .:II:..     .   .... \"I:..II:\"\' \'.. ..:.:\"   .:");
                        System.out.println("     \"\"\"\"::::.\":::II::II::. .         .  .  .  \"\"    .:. .:.:I\'...:\"");
                        System.out.println("          \':: .::I::HII::::.. .     .       ..  .  .  :..:\"\':\"::\"\"\'");
                        System.out.println("           ::.:I:I:::HI::::::. .    ....::::II::.::I::: \'  ::");
                        System.out.println("           IIHHI: \"::IHI::::.\'   .  \'\":\"\"\"\"\"\"\"\"::\"\'\':\'   .:\"");
                        System.out.println("           :IHHIH.::::IIHI::.         \'\":::........::\'    .:");
                        System.out.println("           \':IHIH:\':::.:IIH::. .         \'\':::::::::\"\'  ..:\'");
                        System.out.println("            8::IIH: . \':.\"::I:.       ...::\"\'\'     \'\'\' .::\"");
                        System.out.println("           .:..:IIH. . \':.\':::I:. .  ...            . .::\"");
                        System.out.println("       ..:HI. ..IIHI  .  \'..\'::::II::.    .       .  .::\"");
                        System.out.println(" .:::::IIHHI .  II:H: ..   \'.\'...::::::.         ..:::\"");
                        System.out.println("IHI.:H:\" IH:.   ::IIH. ..      \'\'\"::::::::......::\":.");
                        System.out.println("HH:\' \".:IHI .   \':IIHI: .\'.        \'\"\"::::\"\"\"\'\'\"  .::");
                        System.out.println("IH:..::IIH\'..    :IIIHI. . \'.    .   .    .     .\'.::");
                        System.out.println("I:HI:\".IHI.::.   .:IIIHI. ..  \'.    .  .\'     ..\'. :\":.");
                        System.out.println("I::\'.:I::::::. . .:IIIIHI. .. . \'.   ..     ..\'  .:I:.\":.");
                        System.out.println(" I:IIH.::\':::.. ...:IIIIHH.  ..    \'.:.. ..\'\'   .::IHI: \":.");
                        System.out.println(".:II:::. ..::.. . .:IIIIIHH.  :.. ..::\'\'...::..:\".:HHIII. \":.");
                        System.out.println("III:...:...::. . . ::IIIIHHH  ......:. ..  \'::::.::IHHHHH:. :.");
                        System.out.println("II:::::. ..:::. . ..::IIIHIH ........: .. .. \'.:.:\'\'IHHHHHI :\'");
                        System.out.println(" :::::. . .:::..  ...::IIHHI :..... .. .... ... \'...::IHHH :\'");
                        System.out.println("II::::.:.::::.::.  .. :II:H: :....  .:  \':.. ... \'...::HHI I(.");
                        System.out.println(":::::::.:::::..:..  ..:II:HI \':..  .::.  \'... ...   ..:IH: H::.:.");
                        System.out.println(":::.....:::::..:.:. . .:::IH. \':. ..::..  \'... \'...   \'.HI \"H:...:.");
                        System.out.println("::... ..::::::.::.... ::..IIH. \':...:8...  \'.    ....:\'..H  \"H:..:.:.");
                        System.out.println("\'\'  \'\'..:::I::..:.:...::.:IIIH. \':.::.::.... .::::\'\'.:.\'\':H. \"H:. .:  .");
                        System.out.println("   . . ..::I:::.:::.. .::::IIIH  :.:: :\'\'\'\' .:: ::   \':..:IH. :I ...:.");
                        System.out.println("    . . ..II:::::::..  .:::IIIH  :.::  .:::\'.:\' :::  .:\'.IIHH :H :..: .");
                        System.out.println("     . . .II::.:.:::.. .:::IIHH  :.::..:::\' ::  ..:. :.::HIHI :I.:: :: .");
                        System.out.println("      . . :II:. .::. ..  \":IIHH  :.:\'\'\'\":\'  :\',  . \'..\'\"\"I:HI H\' \':. ::");
                        System.out.println("       .   I::. .::.  .   :IIIH  :.::   \'\'\'\':\'  ..   :. :I.II H. .:. \":.");
                        System.out.println("      .    :::. .I::. .   ::IIH: ::::..  . .:\':.\':\' ..\' .I:I: H ..:. .::.");
                        System.out.println("           :::...::I:..   .::IHI ,:::...  ....\'  \'..\'. .:I::: I. ::\' . ::");
                        System.out.println("            I::.\'\'::I...  .::IIH .::.:.. . ..  ..   :.   :.:: I..:  . .");
                        System.out.println("            :I:.. :::H. .  \"::IH .:\'\"::. .  .. ..   ::...:\'.: I..:   .");
                        System.out.println("            \"II.. \":::H. .  .::H. :.:.::. ..::.:\'  .:\'\'\':::I\'.I .: :.");
                        System.out.println("             II:.  :::I:.  . ::HI I.::..\'\'\' :\'::.  :.   \"::IS:I:II::.");
                        System.out.println("             :I:   .:::I:. ..::HI I.:: \'   . .:::\' .\'    \':I :III:::. .");
                        System.out.println("              :I.   ..::I:...::IH I:.. .  .  .    . .. .  ::.III:::. .");
                        System.out.println("              \':\'  .....:I::.:::H I::\' . .    . .   ...  .: IIII:I:..");
                        System.out.println("                    . ...:I:.:::H I:\' .  .   .      ..   :: III:::. .");
                        System.out.println("                     . ...:I:..:H I: .    . ..       .  ..: III..::.");
                        System.out.println("                      . ...:I:.:H.::      . ..     . . ..:: II:\'\':\'");
                        System.out.println("                        . ..:I..::.:     . .      ... .. :: I:\" .");
                        System.out.println("                         . ..::.:.:        .     ......  :\'");
                        System.out.println("                           ...::\'          .   ... .");
                        System.out.println("                            \':\':\'          .   ..");
                        System.out.println("                                          .   .");
                }
                else if (guess < 1 || guess > 100)
                {
                    System.out.println("You are out of range. It's a number between 1 to 100 (exclusive).");
                }
                else if (guess != ran && tries == 8)
                {
                    System.out.println("\nStill not it, THIS IS YOUR LAST CHANCE!");
                }
                else if (guess == wig)
                {
                    System.out.println("Congrats, you have guessed the wrong number. However, you hit the wig jackpot. You get a Washington wig for free.");
                }
                else if (guess < (ran-90))
                {
                    System.out.println("Nope, you are not even close. WAYYY TOO LOW.");
                }
                else if (guess > (ran+90))
                {
                    System.out.println("Nope, you are not even close. TOO HIGH TOO HIGH.");
                }
                else if (guess < (ran-70))
                {
                    System.out.println("Nope, you are kinda far. VERY LOW.");
                }
                else if (guess > (ran+70))
                {
                    System.out.println("Nope, you are kinda far. TOO HIGH.");
                }
                else if (guess < (ran-50))
                {
                    System.out.println("Nope, not really it. TOO LOW.");
                }
                else if (guess > (ran+50))
                {
                    System.out.println("Nope, not really it. YOU WENT TOO HIGH.");
                }
                else if (guess < (ran-20))
                {
                    System.out.println("Nahhhh. YOU ARE ON THE LOW END.");
                }
                else if (guess > (ran+20))
                {
                    System.out.println("Nahhhh. GO LOWERRRR.");
                }
                else if (guess < (ran-15))
                {
                    System.out.println("NO NO NO. Not that low ok.");
                }
                else if (guess > (ran+15))
                {
                    System.out.println("NO NO NO. Go lower than that.");
                }
                else if (guess < (ran-10))
                {
                    System.out.println("Not it. Go higher.");
                }
                else if (guess > (ran+10))
                {
                    System.out.println("Not it. Go lower.");
                }
                else if (guess < (ran-5))
                {
                    System.out.println("Today\'s not your day. Go higher a bit.");
                }
                else if (guess > (ran+5))
                {
                    System.out.println("Today\'s not your day. Go lower a bit.");
                }
                else 
                {
                    System.out.println("YOU ARE MUCHO CLOSE!");
                }
                
                if (guess != ran && tries < 9)
                {
                    System.out.print("\nThis is your #" + (tries + 2) + " try. ");
                    System.out.println("Try again:");
                }
                tries ++;
                areyou = 0;
            }

                if (guess != ran && areyou == 0)
                {
                    System.out.print("Unfortunately, you are NOT George Washington.");
                }   
        }

    }

}
