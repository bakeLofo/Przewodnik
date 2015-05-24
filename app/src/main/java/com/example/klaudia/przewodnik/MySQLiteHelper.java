package com.example.klaudia.przewodnik;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_DESCRIPTION = "descriptions";
    public static final String COLUMN_ID = "_id";
    public static final String TITLE = "title";
    public static final String COLUMN_DESCRIPTION = "descriptions";

    private static final String DATABASE_NAME = "descriptions.db";
    private static final int DATABASE_VERSION = 1;

    // Database creation sql statement
    private static final String DATABASE_CREATE = "create table "
            + TABLE_DESCRIPTION + "(" + COLUMN_ID
            + " integer primary key autoincrement, "+
            TITLE + " text not null, " +
            COLUMN_DESCRIPTION
            + " text not null);";
//    private static final int CONFLICT_REPLACE = 0;

    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(DATABASE_CREATE);

        ContentValues values = new ContentValues();

        values.put("_id", 1);
        values.put("title", "Rynek");
        values.put("descriptions", "To przede wszystkim śliczne zabytkowe kamienice (np. Pod Gryfami, Pod Złotym Słońcem, Pod Siedmioma Elektorami, Pod Złotym Dzbanem, Pod Zieloną Dynią) – podobne jak w Gdańsku czy Sztokholmie (wszystkie miasta należały do grupy miast Hanzy), które go otaczają. Tutaj też znajduje się Nowy Ratusz, Ratusz z XIII wieku wyróżnia się pięknymi elementami dekoracyjnymi i wieżą z zegarem astronomicznym (na parterze zobaczymy najstarszą karzmę w mieście, mieści się tu także oddział Muzeum Miejskiego – Muzeum Sztuki Mieszczańskiej). Ogromną atrakcją turystyczną w pobliżu Rynku są także dwa budynki zwane „Jaś i Małgosia” – małe, urocze domki połączone ze sobą barokową bramą i znajdujące się tuż przy okazałym kościele św. Elżbiety z tarasem widokowym na wieży. Na Rynku można spotkać także małe krasnale ( z resztą nie tylko tam, figurki małych ludzików w czapeczkach możemy dostrzec w wielu miejscach w mieście).Na uwagę zasługuje także przyległy do Rynku dawny plac targowy zwany Solnym – gdzie obok licznych handlarek sprzedających kolorowe kwiaty znajduje się także XIV – wieczny kościół świętej Marii Magdaleny.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 2);
        values.put("title", "Ratusz");
        values.put("descriptions", "Wrocławski Ratusz, późnogotycki budynek na wrocławskim Rynku, jeden z najlepiej zachowanych historycznych ratuszy w Polsce, zarazem jeden z głównych zabytków architektonicznych Wrocławia. Współcześnie Ratusz mieści oddział wrocławskiego Muzeum Miejskiego, Muzeum Sztuki Mieszczańskie. W piwnicach Ratusza znajduje się Piwnica Świdnicka, jeden z najstarszych lokali gastronomicznych w Europie.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

/*
        values.put("_id", );
        values.put("title", "");
        values.put("descriptions", "" );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, CONFLICT_REPLACE);
*/


        values.put("_id", 3);
        values.put("title", "Ostrów Tumski");
        values.put("descriptions", "Hit miasta i pozytywny przykład tego jak miasta powinny zwracać się ku rzekom. Bo powinny! To najstarsza część Wrocławia (siedziba pierwszych Piastów). Leży na jednej z Odrzańskich wysp, a uroczo jest tu szczególnie po zmroku kiedy gazowe latarnie oświetlają wąskie, romantyczne uliczki. Ponieważ w zamierzchłych czasach miejsce to stanowiło siedzibę biskupstwa, to znajdziemy tu przede wszystkim liczne zabytki sakralne: Kościół świętego Marcina, kościół świętego Idziego, wspaniała gotycka kolegiata świętego Krzyża i świętego Bartłomieja czy Archikatedra św. Jana Chrzciciela ze znakomitymi kaplicami gotyckimi oraz barokowymi. Tutaj też podziwiać można wiele zabytkowych budowli – wprawdzie nie sakralnych ale z kościołem związanych np. Kuria Arcybiskupia, Pałac Arcybiskupi itp. Na uwagę zasługuje ciekawy Ogród Botaniczny i Muzeum, Biblioteka i Archiwum Archidiecezjalne ( z najstarszym polskim dzwonem i uwaga! Księgą Henrykowską)");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 4);
        values.put("title", "Panorama Racławicka");
        values.put("descriptions", "Potężny panoramiczny obraz olejny autorstwa Jana Styki i Wojciecha Kossaka, malarzy tworzących na przełomie XIX i XX wieku. Przedstawia bitwę pod Racławicami (1794). Panorama namalowana jest na cylindrycznym płótnie rozpiętym w budynku rotundy. Ekspozycja obejmuje sztafaż ustawiony i oświetlony tak, aby widz oglądający malowidło nie odróżniał, gdzie stoją się ustawione przed obrazem obiekty, a gdzie zaczyna sam obraz. Zwiedzanie Muzeum Narodowego gratis!");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 5);
        values.put("title", "\n Hala Stulecia");
        values.put("descriptions", "Znajduje się w Parku Szczytnickim na wschód od centrum. Budowla wpisana została stosunkowo niedawno na listę UNESCO – nic dziwnego, skoro po pierwsze jest jedną z pierwszych konstrukcji żelbetowych na całym świecie a po drugie jaj rozmiary są naprawdę imponujące! Warto wspomnieć także o samym Parku Szczytnickim – jednym z fajniejszych terenów rekreacyjnych w mieście, to tutaj znajduje się np Ogród Japoński oraz stary – średniowieczny drewniany kościółek. W niewielkiej odległości od imponującej Hali zaprojektowanej przez Maxa Berga znajduje się słynne wrocławskie ZOO, multimedialna, podświetlana fontanna na stawie (przy pergoli wykonanej także z żelbetu), Iglica –  żelbetowa, a jakże i Pawilon Czterech Kopuł.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 6);
        values.put("title", "Ogród zoologiczny i Afrykarium");
        values.put("descriptions", "Najpopularniejszy Ogród Zoologiczny w Polsce. Założony w 1865, jest drugim pod względem wieku na ziemiach polskich i największym pod względem liczby wystawianych zwierząt ogrodem w Polsce. Obecnie ZOO zajmuje powierzchnię 33 ha. Na kolekcję składa się 6815 zwierząt reprezentujących 559 gatunków. Wiele wartościowych obiektów, reprezentujących XIX-wieczny historyzm i eklektyzm - słoniarnia, małpiarnia, gadziarnia. Pawilon Madagaskaru, Pawilon Sahary, wybieg rysi i żbików, Odrarium i Afrykarium. Afrykarium to obiekt prezentujący życiodajne wody Afryki, został otwarty w dniu 26 października 2014 r. To kompleks przedstawiający różne ekosystemy związane ze środowiskiem wodnym Czarnego Lądu. Łącznie znajduje się tu 19 basenów i zbiorników przedstawiających m.in. rafę koralową Morza Czerwonego, hipopotamy nilowe, ryby słodkowodne jezior Malawi i Tanganiki. Głębiny Kanału Mozambickiego można podziwiać z podwodnego, akrylowego tunelu o długości o 18 m.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 7);
        values.put("title", "\n Ogród japoński");
        values.put("descriptions", "Jeden z największych parków Wrocławia zajmujący powierzchnię około 100 ha. Park ma charakter krajobrazowy i duże walory kompozycyjne oraz dendrologiczne (około 400 gatunków drzew i krzewów). W parku znajduje sięOgród Japoński założony w latach 1909-1912, w związku z Wystawą Stulecia z 1913 roku, z inicjatywy hrabiego Fritza von Hochberga i zaprojektowany przez japońskiego ogrodnika Mankichi Arai. Współcześnie stanowi unikalny w Europie żywy fragment japońskiej kultury.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 8);
        values.put("title", "\n Ogród botaniczny");
        values.put("descriptions", "Ogród Botaniczny Uniwersytetu Wrocławskiego, nazywany oazą piękna i spokoju w sercu wielkiego miasta, to \"żywe muzeum\", a zarazem ośrodek naukowy i dydaktyczny oraz ulubione miejsce wypoczynku wrocławian. Położony jest po północnej stronie katedry Św. Jana Chrzciciela i kościoła Św.Krzyża, częściowo w obrębie historycznego Ostrowa Tumskiego, w odległości ok. 2 km od Rynku. Jest drugim (po ogrodzie krakowskim) najstarszym tego typu ogrodem w Polsce, wpisanym na listę zabytków woj. dolnośląskiego i mieszczącym się w granicach podlegającego szczególnej ochronie historycznego centrum Wrocławia.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 9);
        values.put("title", "Pergola i fontanna multimedialna" );
        values.put("descriptions", "Woda wystrzeliwana jest na wysokość ok. 40 metrów. Na ekranie wodnym o powierzchni ponad 700 m 2 można oglądać artystyczne animacje wzbogacone dźwiękami wody i muzyki. Gejzery, dysze pieniące, dynamiczne, mgielne, punktowe, palmowe, wodne oraz 3 dysze ogniowe. Widowisko wody i ognia wzbogacą obrazy rzucane przez projektor na ekran wodny, a także światła laserów i dźwięki muzyki. Fontannę rozświetla blisko 800 dużych i małych punktów świetlnych umieszczonych w niecce.");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 10);
        values.put("title", "Narodowe Forum Muzyki");
        values.put("descriptions", "W Narodowym Forum Muzyki powstanie sala koncertowa na 1800 osób, trzy sale kameralne (z widowniami od 250 do 450 miejsc), pomieszczenia konferencyjno-biurowe, biblioteka i przestrzeń wystawiennicza. Budynek główny ma mieć powierzchnię użytkową 35,3 tys m² (6 kondygnacji nadziemnych i 3 podziemne). Sala koncertowa będzie odizolowana akustycznie. Narodowe Forum Muzyki powstaje z okazji konkursu Wrocław Europejską Stolicą Kultury 2016!");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 11);
        values.put("title", "\n Opera" );
        values.put("descriptions", "Opera Wrocławska (Stadttheater, Teatr Miejski do 1945 r.) jest jednym z największych i najbardziej znaczących teatrów operowych w Polsce. Gmach Teatru Miejskiego wzniesiono w latach 1839 - 1841 wg projektu Langhansa, z nowoczesną sceną i widownią na około 1600 miejsc. W bardzo bogato zdobionym wnętrzu zachowało się większość zdobień z XIX wieku, m.in.: plafon z portretami kompozytorów, główny żyrandol oraz loża cesarska. Zapraszamy na wieczorne przedstawienia!");
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 12);
        values.put("title", "\n Stadion miejski");
        values.put("descriptions", "Stadion Miejski we Wrocławiu, stadion piłkarski, stanowiący własność miasta Wrocław. Głównym użytkownikiem areny jest klub piłkarski Śląsk Wrocław. Stadion był jedną z aren Euro 2012 - rozegrane na nim zostały trzy mecze fazy grupowej (w tym jeden Reprezentacji Polski - 16 czerwca 2012 roku)." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 13);
        values.put("title", "Sky Tower");
        values.put("descriptions", "Oddany do użytku w maju 2012 roku kompleks mieszkalny, biurowy, handlowo-usługowy i rekreacyjny we Wrocławiu. Budynki stoją w miejscu rozebranego Poltegoru. Główna wieża jest najwyższym budynkiem w Polsce w kategorii wysokość do dachu. Biurowiec SKY TOWER należy do najwyższego w Polsce (212 metrów, 50 pięter) kompleksu architektonicznego, w skład którego wchodzą także część mieszkalna i galeria handlowa. Na rok 2013 zaplanowano otwarcie platformy widokowej" );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 14);
        values.put("title", "Hala Targowa");
        values.put("descriptions", "Wrocławska Hala Targowa to miejsce, gdzie znajdują się liczne  stoiska handlowe z  branży spożywczej, przemysłowej i  usługowej. Obiekt znajduje się pod zarządem PSS Społem Północ.  Przy okazji zakupów można przyjrzeć się dokładniej tej ponad stuletniej budowli, o architekturze wyjątkowej z zewnątrz i od środka. Miejsce to ma swoje plusy jak i minusy, które składają się na jego niepowtarzalny klimat, wcale nie zniechęcając klientów. Wprawdzie daleko mu jeszcze do barwnych i tętniących życiem odpowiedników z zachodu, ale za to można znaleźć tu bardzo szeroki wybór owoców i warzyw, co cenne jest zwłaszcza zimą, taniej niż gdzie indziej wykonać różne drobne usługi oraz zjeść smaczny i niedrogi obiad." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 15);
        values.put("title", "Dworzec Gł.PKP");
        values.put("descriptions", "Największy zadaszony dworzec kolejowy w Polsce ma 150 lat. Budynek dworca powstał w latach 1855-1857 według projektu Wilhelma Grapowa. W dwustumetrowej oszklonej hali był jeden peron, znajdowały się tam także punkty obsługi podróżnych. Kolej dynamicznie się rozwijała i pod koniec XIX stulecia zapadła decyzja o rozbudowie dworca. Nowy obiekt miał cztery perony – każdy po dwa tory pasażerskie i dwa perony bagażowe. Nad całością wybudowano olbrzymią przeszkloną halę. Poza dachem znalazł się jeden peron. Dotychczasowa hala peronowa przejęła funkcję hali obsługującej podróżnych, z kasami biletowymi, restauracjami, poczekalniami, przechowalnią bagażu. Podczas walk o Festung Breslau dworzec nie został poważnie zniszczony. Pierwsi podróżni skorzystali z niego już w czerwcu 1945 roku. Po remoncie przed Euro 2012 w miejscu dawnych schronów powstał parking, odnowiono elewację, na piętrze znalazły się przestrzenie handlowe. Na parterze, w hali pasażerskiej działają restauracje, kawiarnie, sklepy popularnych sieci handlowych." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 16);
        values.put("title", "\n Teatr Capitol");
        values.put("descriptions", "Teatr powstały we Wrocławiu w 2004 roku jako kontynuacja działalności Teatru Muzycznego – Operetki Wrocławskiej w budynku przedwojennego kinoteatru Capitol zbudowanego w 1929 roku. Po II wojnie światowej mieściło się tutaj kino \"Śląsk\". Teatr jest jednostką kulturalną Samorządu Miasta Wrocławia." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 17);
        values.put("title", "Bazylika Św.Elżbiety");
        values.put("descriptions", "Gotycki kościół z wieżą o wysokości 91,46 m przy północno-zachodnim narożniku wrocławskiego rynku, jeden z dwóch dawnych kościołów parafialnych w mieście. Zrekonstruowana wieża ma wysokość 91,46 m. Wnętrzu przywrócono formy zbliżone do gotyckich. Kościół oraz taras widokowy na wieży zostały otwarte dla wiernych i zwiedzających w maju 1997." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 18);
        values.put("title", "\n Pałac Królewski");
        values.put("descriptions", "Pałac królewski we Wrocławiu, także pałac Spätgenów lub zamek królów pruskich, zespół pałacowy stanowiący od XVIII do XX wieku wrocławską rezydencję pruskich królów z dynastii Hohenzollernów. W 2009 w pałacu otwarte zostało Muzeum Miejskie z barokowym ogrodem. Część budynku zajmują odrestaurowane komnaty królewskie. Na wystawie \"1000 lat Wrocławia\" prezentowanych jest prawie trzy tysiące eksponatów, wiele z nich ze zbiorów polskich i niemieckich kolekcjonerów." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 19);
        values.put("title", "Wrocławskie krasnale");
        values.put("descriptions", "Największa atrakcja Wrocławia dla dzieci! Ponad 150 figurek spiżowych krasnali umieszczanych na ulicach Wrocławia od 2001 r. Organizowane są wycieczki szlakiem krasnali i wydawane broszurki dla turystów chcących połączyć odnajdywanie kolejnych figurek ze zwiedzaniem Wrocławia. Każdy ze skrzatów opowiada historię miejsca, w którym stoi! Szukanie wrocławskich krasnali to znakomity sposób na ciekawe zwiedzanie stolicy Dolnego Śląska." );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);

        values.put("_id", 20);
        values.put("title", "Kolejka linowa „Polinka”");
        values.put("descriptions", "Kolej gondolowa, kursująca nad Odrą pomiędzy głównym kampusem Politechniki Wrocławskiej na Wybrzeżu Wyspiańskiego a Geocentrum przy ulicy Na Grobli. Została wybudowana przez firmę Doppelmayr Garaventa Group na zlecenie Politechniki i oddana do użytku 1 października 2013 roku. Od 1.02.2014 przejazd „Polinką” jest bezpłatny wyłącznie dla pracowników i studentów Politechniki Wrocławskiej. Ceny biletów dla turystów są takie same jak ceny biletów na linie normalne i podmiejskie wrocławskiej komunikacji zbiorowej" );
        database.insertWithOnConflict(TABLE_DESCRIPTION, null, values, SQLiteDatabase.CONFLICT_REPLACE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DESCRIPTION);
        onCreate(db);
    }

}