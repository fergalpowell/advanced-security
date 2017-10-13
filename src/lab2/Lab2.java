package lab2;
import java.util.Scanner;

public class Lab2 {
    public void exercise1() {
        String message;
        String encryptedMessage = "RQH YDULDWLRQ WR WKH VWDQGDUG FDHVDU FLSKHU LV ZKHQ\n" +
                "WKH DOSKDEHW LV \"NHBHG\" EB XVLQJ D ZRUG. LQ WKH\n" +
                "WUDGLWLRQDO YDULHWB, RQH FRXOG ZULWH WKH DOSKDEHW RQ\n" +
                "WZR VWULSV DQG MXVW PDWFK XS WKH VWULSV DIWHU VOLGLQJ\n" +
                "WKH ERWWRP VWULS WR WKH OHIW RU ULJKW. WR HQFRGH, BRX\n" +
                "ZRXOG ILQG D OHWWHU LQ WKH WRS URZ DQG VXEVWLWXWH LW\n" +
                "IRU WKH OHWWHU LQ WKH ERWWRP URZ. IRU D NHBHG YHUVLRQ,\n" +
                "RQH ZRXOG QRW XVH D VWDQGDUG DOSKDEHW, EXW ZRXOG ILUVW\n" +
                "ZULWH D ZRUG (RPLWWLQJ GXSOLFDWHG OHWWHUV) DQG WKHQ\n" +
                "ZULWH WKH UHPDLQLQJ OHWWHUV RI WKH DOSKDEHW. IRU WKH\n" +
                "HADPSOH EHORZ, L XVHG D NHB RI \"UXPNLQ.FRP\" DQG BRX ZLOO VHH\n" +
                "WKDW WKH SHULRG LV UHPRYHG EHFDXVH LW LV QRW D OHWWHU.\n" +
                "BRX ZLOO DOVR QRWLFH WKH VHFRQG \"P\" LV QRW LQFOXGHG\n" +
                "EHFDXVH WKHUH ZDV DQ P DOUHDGB DQG BRX FDQ'W KDYH\n" +
                "GXSOLFDWHV.";
        int key = 3;
        char ch;
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < encryptedMessage.length(); i++) {
            ch = encryptedMessage.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - key);

                if (ch < 'A') {
                    ch = (char) (ch + 'Z' - 'A' + 1);
                }

                builder.append(ch);

            } else {
                builder.append(ch);
            }
        }
        message = builder.toString();
        System.out.println("EX 1)");
        System.out.println("Decrypted Message = " + message);
    }

    public void exercise2(){

        String message;
        String encryptedMessage = "FEV MRIZRKZFE KF KYV JKREURIU TRVJRI TZGYVI ZJ NYVE KYV\n" +
                "RCGYRSVK ZJ \"BVPVU\" SP LJZEX R NFIU. ZE KYV KIRUZKZFERC\n" +
                "MRIZVKP, FEV TFLCU NIZKV KYV RCGYRSVK FE KNF JKIZGJ REU ALJK\n" +
                "DRKTY LG KYV JKIZGJ RWKVI JCZUZEX KYV SFKKFD JKIZG KF KYV\n" +
                "CVWK FI IZXYK. KF VETFUV, PFL NFLCU WZEU R CVKKVI ZE KYV KFG\n" +
                "IFN REU JLSJKZKLKV ZK WFI KYV CVKKVI ZE KYV SFKKFD IFN. WFI R\n" +
                "BVPVU MVIJZFE, FEV NFLCU EFK LJV R JKREURIU RCGYRSVK, SLK\n" +
                "NFLCU WZIJK NIZKV R NFIU (FDZKKZEX ULGCZTRKVU CVKKVIJ) REU\n" +
                "KYVE NIZKV KYV IVDRZEZEX CVKKVIJ FW KYV RCGYRSVK. WFI KYV\n" +
                "VORDGCV SVCFN, Z LJVU R BVP FW \"ILDBZE.TFD\" REU PFL NZCC JVV\n" +
                "KYRK KYV GVIZFU ZJ IVDFMVU SVTRLJV ZK ZJ EFK R CVKKVI. PFL\n" +
                "NZCC RCJF EFKZTV KYV JVTFEU \"D\" ZJ EFK ZETCLUVU SVTRLJV KYVIV\n" +
                "NRJ RE D RCIVRUP REU PFL TRE'K YRMV ULGCZTRKVJ.";
        int key;
        char ch;
        StringBuilder builder = new StringBuilder();
        String answer;

        for (int i = 0; i < 25; i++) {
            key = i;

            for (int j = 0; j < encryptedMessage.length(); j++) {
                ch = encryptedMessage.charAt(j);
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + key);

                    if (ch > 'Z') {
                        ch = (char) (ch - 'Z' + 'A' - 1);
                    }
                    builder.append(ch);
                } else {
                    builder.append(ch);
                }
            }
            message = builder.toString();
            System.out.println("EX) 2");
            System.out.println("Decrypted Message = " + message);
            System.out.println("Is this decrytpion correct? [y/n]");
            Scanner scanner1 = new Scanner(System.in);
            answer = scanner1.nextLine();
            if (answer.equals("y")) {
                System.out.println("The key is: " + key);
                break;
            }

            message = "";
            builder.setLength(0);
        }

    }

    public void exercise3(){
        String message = "";
        String encryptedMessage = "XQKP IZ IMWEB LK AUVZCXKW PHL VPE RIKD ASOZZSBZI TOIE ESTD\n" +
                "XEJWXM CPS-3. PHPA TA DPW NEZCWB YN S OIE-GPIB KGIPLBTBSWF, WNK\n" +
                "UJ WGV KGEPV TA YVW KF APP NSDW NETITVSVY BIUIWQCBK (KUA WQ\n" +
                "IX QFETPIW 64). QD'A HNOIIMTI BGK LHBP NYZ EA TV IQNOKL PHL NTVKT\n" +
                "VACPATWX, JMP I HU SWZQFC FVZ \"YW KESND.\" PB'D VYB LDAA BSM XMO\n" +
                "DAZP QCXKLEOUA LZOV'L WNF OZWN, QL'O TOIE EO LGJ'T YMLTVG FAEK\n" +
                "WYM. GPWJ WL AEIBBWZ TOQD XBWUASZ JLKU QF 2006, ET SWZSOL SO IM\n" +
                "EP EYCDZ BL VPMNQFC A UMH PKAZ BUUKEQYV KKOU. BSM CPS\n" +
                "BATQWG (GPAYH PA CMKTDU PHZE WP BZA MK4 IYL WL5 XWMPTJ), EKA\n" +
                "MJDLZ TVMZWWSPVR XBMKOUYM QZYU FAW AGAMC WX\n" +
                "YRFXEIXIDUSPA. HM NQVJ'T RVZE RWO HOUO EPO DSNIVCD ARI-2\n" +
                "NWRPIYBC EGQLK ZPUKQF OEJCCM. LCL ET'Z 2012, IYL CPS-512 ES ZBTTV\n" +
                "TGKKPVR OYWV.\n" +
                "AVLV HWBAW, JOUM ZN DPW OHH-3 KLVNQVWTLA TA CQYJIMQNIXBDU\n" +
                "BLBEMB. AGIE HZP NKALAR, ICE VYB GNDLZD WP USCNPBFLO NSOTLZ.\n" +
                "DWWM SNE ZULTVMJ EN OICLGIJA, BBB YWD WJZEYA ZN WIYJIACOM\n" +
                "CUSHLLZ. HPOV KDA-3 PA LVXWMJCLL, T'U QWAJG AW CMMWEIEUL\n" +
                "EPKB, MJLLAD BRM AIPYWGMWMFPS HZP KBQLECHT EW DPWER\n" +
                "HXATSKSPIVV, AMYXDA SAQNS GQLD TOM EZSMV WNK BCCO AZW-512.\n" +
                "AA TPICB XKR H ESQVM. A ZOU'B EPSVC JIZB TA QWAJG AW LVXWMJCL\n" +
                "\"VZ IGIJZ\"; I APTVU QL'O GVQYO DW HECR WYM. KVV KF APP NSDW\n" +
                "NETITVSVY, E DVV'E ZOIDHY OIGM K NSROYQEM. YN UKUYAP Q GIFP\n" +
                "SRMTV DW OEN, ICE BRIL'O OBB ZN ZMJOOUIW XBQVA, NVB QWB AGIE\n" +
                "VJUMMBARE YMLAYV. SJD DPTTO Q DEKL AZUO UGNE APLV YBZARZ, Q\n" +
                "EPSVC WNF EZCVL TA ORIJ. EOTD, IAFJP BRMJA'S VVP ZOIKKN UQDB\n" +
                "CPGQLK KSWYAW OKLQY. AUMAJ IZV'E REAL W HHAS NEVUPIVV, TB'C\n" +
                "BZA LHZRM-LTGYK JQAPOZ LDRLMQQCP SJD H UPKRIFEST BZ BEZF ET\n" +
                "PVEW K PSOH MCYKDQGJ. I APTVU BZA WVZWL KKLQASTJ VOMVO A\n" +
                "SICOO-JDKCR KTXRMJ, WNK QQ VSAL YHVWDMC ACAIU, EP'TV OWP OUM.";
        String key = "KISWAHILI";
        char ch;
        StringBuilder builder = new StringBuilder();

        for (int i = 0, j = 0; i < encryptedMessage.length(); i++)
        {
            ch = encryptedMessage.charAt(i);

            if (ch < 'A' || ch > 'Z')
                continue;
            builder.append((char)((ch - key.charAt(j) + 26) % 26 + 'A'));
            j = ++j % key.length();
        }
        message = builder.toString();
        System.out.println("EX) 3");
        System.out.println("Decrypted Message = " + message);
    }

    public static void main(String[] s){
        Lab2 lab = new Lab2();
        String answer;

        System.out.println("Perform exercise 1? [y/n]");
        Scanner scanner = new Scanner(System.in);
        answer = scanner.nextLine();
        if(answer.equals("y")){
            lab.exercise1();
        }

        System.out.println("Perform exercise 2? [y/n]");
        Scanner scanner2 = new Scanner(System.in);
        answer = scanner2.nextLine();
        if(answer.equals("y")){
            lab.exercise2();
        }

        System.out.println("Perform exercise 3? [y/n]");
        Scanner scanner3 = new Scanner(System.in);
        answer = scanner2.nextLine();
        if(answer.equals("y")){
            lab.exercise3();
        }
    }
}


