package com.example.myappspk.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Company {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("update")
    @Expose
    private String update;
    @SerializedName("тип")
    @Expose
    private String тип;
    @SerializedName("датаВып")
    @Expose
    private String датаВып;
    @SerializedName("датаОгрн")
    @Expose
    private String датаОгрн;
    @SerializedName("огрн")
    @Expose
    private String огрн;
    @SerializedName("инн")
    @Expose
    private String инн;
    @SerializedName("статусНаим")
    @Expose
    private String статусНаим;
    @SerializedName("статусКод")
    @Expose
    private String статусКод;
    @SerializedName("имяПолное")
    @Expose
    private String имяПолное;
    @SerializedName("имяКраткое")
    @Expose
    private String имяКраткое;
    @SerializedName("СвУчетНОObject")
    @Expose
    СвУчетНО СвУчетНОObject;
    @SerializedName("СвРегОргObject")
    @Expose
    СвРегОрг СвРегОргObject;
    @SerializedName("СвРегПФObject")
    @Expose
    СвРегПФ СвРегПФObject;
    @SerializedName("СвРегФССObject")
    @Expose
    СвРегФСС СвРегФССObject;
    @SerializedName("ОснВидДеятельностиObject")
    @Expose
    ОснВидДеятельности ОснВидДеятельностиObject;
    @SerializedName("допВидДеятельности")
    @Expose
    ArrayList < Object > допВидДеятельности = new ArrayList < Object > ();
    @SerializedName("свЗап")
    @Expose
    ArrayList < Object > свЗап = new ArrayList < Object > ();
    @SerializedName("кпп")
    @Expose
    private String кпп;
    @SerializedName("спрОПФ")
    @Expose
    private String спрОПФ;
    @SerializedName("кодОПФ")
    @Expose
    private String кодОПФ;
    @SerializedName("НаимГрнДатаObject")
    @Expose
    НаимГрнДата НаимГрнДатаObject;
    @SerializedName("полнНаимОПФ")
    @Expose
    private String полнНаимОПФ;
    @SerializedName("cвАдрес")
    @Expose
    свАдрес свАдрес;
    @SerializedName("СвОбрЮЛObject")
    @Expose
    СвОбрЮЛ СвОбрЮЛObject;
    @SerializedName("СвУстКапObject")
    @Expose
    СвУстКап СвУстКапObject;
    @SerializedName("СвДрежРеестрАОObject")
    @Expose
    СвДрежРеестрАО СвДрежРеестрАОObject;
    @SerializedName("учрЮЛРос")
    @Expose
    ArrayList < Object > учрЮЛРос = new ArrayList < Object > ();
    @SerializedName("учрФЛ")
    @Expose
    ArrayList < Object > учрФЛ = new ArrayList < Object > ();

    public ArrayList<свДолжнФЛ> getСвДолжнФЛ() {
        return свДолжнФЛ;
    }

    public void setСвДолжнФЛ(ArrayList<свДолжнФЛ> свДолжнФЛ) {
        this.свДолжнФЛ = свДолжнФЛ;
    }

    @SerializedName("свДолжнФЛ")
    @Expose
    ArrayList < свДолжнФЛ > свДолжнФЛ = new ArrayList < свДолжнФЛ > ();


    // Getter Methods

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getUpdate() {
        return update;
    }

    public String getТип() {
        return тип;
    }

    public String getДатаВып() {
        return датаВып;
    }

    public String getДатаОгрн() {
        return датаОгрн;
    }

    public String getОгрн() {
        return огрн;
    }

    public String getИнн() {
        return инн;
    }

    public String getСтатусНаим() {
        return статусНаим;
    }

    public String getСтатусКод() {
        return статусКод;
    }

    public String getИмяПолное() {
        return имяПолное;
    }

    public String getИмяКраткое() {
        return имяКраткое;
    }

    public СвУчетНО getСвУчетНО() {
        return СвУчетНОObject;
    }

    public СвРегОрг getСвРегОрг() {
        return СвРегОргObject;
    }

    public СвРегПФ getСвРегПФ() {
        return СвРегПФObject;
    }

    public СвРегФСС getСвРегФСС() {
        return СвРегФССObject;
    }

    public ОснВидДеятельности getОснВидДеятельности() {
        return ОснВидДеятельностиObject;
    }

    public String getКпп() {
        return кпп;
    }

    public String getСпрОПФ() {
        return спрОПФ;
    }

    public String getКодОПФ() {
        return кодОПФ;
    }

    public НаимГрнДата getНаимГрнДата() {
        return НаимГрнДатаObject;
    }

    public String getПолнНаимОПФ() {
        return полнНаимОПФ;
    }

    public свАдрес getСвАдрес() {
        return свАдрес;
    }

    public СвОбрЮЛ getСвОбрЮЛ() {
        return СвОбрЮЛObject;
    }

    public СвУстКап getСвУстКап() {
        return СвУстКапObject;
    }

    public СвДрежРеестрАО getСвДрежРеестрАО() {
        return СвДрежРеестрАОObject;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public void setТип(String тип) {
        this.тип = тип;
    }

    public void setДатаВып(String датаВып) {
        this.датаВып = датаВып;
    }

    public void setДатаОгрн(String датаОгрн) {
        this.датаОгрн = датаОгрн;
    }

    public void setОгрн(String огрн) {
        this.огрн = огрн;
    }

    public void setИнн(String инн) {
        this.инн = инн;
    }

    public void setСтатусНаим(String статусНаим) {
        this.статусНаим = статусНаим;
    }

    public void setСтатусКод(String статусКод) {
        this.статусКод = статусКод;
    }

    public void setИмяПолное(String имяПолное) {
        this.имяПолное = имяПолное;
    }

    public void setИмяКраткое(String имяКраткое) {
        this.имяКраткое = имяКраткое;
    }

    public void setСвУчетНО(СвУчетНО свУчетНОObject) {
        this.СвУчетНОObject = свУчетНОObject;
    }

    public void setСвРегОрг(СвРегОрг свРегОргObject) {
        this.СвРегОргObject = свРегОргObject;
    }

    public void setСвРегПФ(СвРегПФ свРегПФObject) {
        this.СвРегПФObject = свРегПФObject;
    }

    public void setСвРегФСС(СвРегФСС свРегФССObject) {
        this.СвРегФССObject = свРегФССObject;
    }

    public void setОснВидДеятельности(ОснВидДеятельности оснВидДеятельностиObject) {
        this.ОснВидДеятельностиObject = оснВидДеятельностиObject;
    }

    public void setКпп(String кпп) {
        this.кпп = кпп;
    }

    public void setСпрОПФ(String спрОПФ) {
        this.спрОПФ = спрОПФ;
    }

    public void setКодОПФ(String кодОПФ) {
        this.кодОПФ = кодОПФ;
    }

    public void setНаимГрнДата(НаимГрнДата наимГрнДатаObject) {
        this.НаимГрнДатаObject = наимГрнДатаObject;
    }

    public void setПолнНаимОПФ(String полнНаимОПФ) {
        this.полнНаимОПФ = полнНаимОПФ;
    }

    public void setСвАдрес(свАдрес свАдрес) {
        this.свАдрес = свАдрес;
    }

    public void setСвОбрЮЛ(СвОбрЮЛ свОбрЮЛObject) {
        this.СвОбрЮЛObject = свОбрЮЛObject;
    }

    public void setСвУстКап(СвУстКап свУстКапObject) {
        this.СвУстКапObject = свУстКапObject;
    }

    public void setСвДрежРеестрАО(СвДрежРеестрАО свДрежРеестрАОObject) {
        this.СвДрежРеестрАОObject = свДрежРеестрАОObject;
    }

    public static class СвДрежРеестрАО {
        @SerializedName("огрн")
        @Expose
        private String огрн;
        @SerializedName("инн")
        @Expose
        private String инн;
        @SerializedName("наимЮЛПолн")
        @Expose
        private String наимЮЛПолн;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getОгрн() {
            return огрн;
        }

        public String getИнн() {
            return инн;
        }

        public String getНаимЮЛПолн() {
            return наимЮЛПолн;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setОгрн(String огрн) {
            this.огрн = огрн;
        }

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public void setНаимЮЛПолн(String наимЮЛПолн) {
            this.наимЮЛПолн = наимЮЛПолн;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }
    public static class ГрнДата {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }
    public static class СвУстКап {
        @SerializedName("наимВидКап")
        @Expose
        private String наимВидКап;
        @SerializedName("сумКап")
        @Expose
        private float сумКап;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getНаимВидКап() {
            return наимВидКап;
        }

        public float getСумКап() {
            return сумКап;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setНаимВидКап(String наимВидКап) {
            this.наимВидКап = наимВидКап;
        }

        public void setСумКап(float сумКап) {
            this.сумКап = сумКап;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

    public static class СвОбрЮЛ {
        @SerializedName("кодСпОррЮЛ")
        @Expose
        private String кодСпОррЮЛ;
        @SerializedName("наимСпОбрЮЛ")
        @Expose
        private String наимСпОбрЮЛ;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getКодСпОррЮЛ() {
            return кодСпОррЮЛ;
        }

        public String getНаимСпОбрЮЛ() {
            return наимСпОбрЮЛ;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setКодСпОррЮЛ(String кодСпОррЮЛ) {
            this.кодСпОррЮЛ = кодСпОррЮЛ;
        }

        public void setНаимСпОбрЮЛ(String наимСпОбрЮЛ) {
            this.наимСпОбрЮЛ = наимСпОбрЮЛ;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

    public static class свАдрес {
        @SerializedName("aдресРФ")
        @Expose
        адресРФ адресРФ;


        // Getter Methods

        public адресРФ getАдресРФ() {
            return адресРФ;
        }

        // Setter Methods

        public void setАдресРФ(адресРФ адресРФ) {
            this.адресРФ = адресРФ;
        }
    }
    public static class адресРФ {
        @SerializedName("регион")
        @Expose
        регион Регион;
        @SerializedName("улица")
        @Expose
        улица Улица;
        @SerializedName("индекс")
        @Expose
        private String индекс;
        @SerializedName("кодРегион")
        @Expose
        private String кодРегион;
        @SerializedName("кодАдрКладр")
        @Expose
        private String кодАдрКладр;
        @SerializedName("дом")
        @Expose
        private String дом;
        @SerializedName("кварт")
        @Expose
        private String кварт;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public регион getРегион() {
            return Регион;
        }

        public улица getУлица() {
            return Улица;
        }

        public String getИндекс() {
            return индекс;
        }

        public String getКодРегион() {
            return кодРегион;
        }

        public String getКодАдрКладр() {
            return кодАдрКладр;
        }

        public String getДом() {
            return дом;
        }

        public String getКварт() {
            return кварт;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setРегион(регион регионObject) {
            this.Регион = регионObject;
        }

        public void setУлица(улица улицаObject) {
            this.Улица = улицаObject;
        }

        public void setИндекс(String индекс) {
            this.индекс = индекс;
        }

        public void setКодРегион(String кодРегион) {
            this.кодРегион = кодРегион;
        }

        public void setКодАдрКладр(String кодАдрКладр) {
            this.кодАдрКладр = кодАдрКладр;
        }

        public void setДом(String дом) {
            this.дом = дом;
        }

        public void setКварт(String кварт) {
            this.кварт = кварт;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

    public static class улица {
        @SerializedName("тип")
        @Expose
        private String тип;
        @SerializedName("наименование")
        @Expose
        private String наименование;


        // Getter Methods

        public String getТип() {
            return тип;
        }

        public String getНаименование() {
            return наименование;
        }

        // Setter Methods

        public void setТип(String тип) {
            this.тип = тип;
        }

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }
    }
    public static class регион {
        @SerializedName("тип")
        @Expose
        private String тип;
        @SerializedName("наименование")
        @Expose
        private String наименование;


        // Getter Methods

        public String getТип() {
            return тип;
        }

        public String getНаименование() {
            return наименование;
        }

        // Setter Methods

        public void setТип(String тип) {
            this.тип = тип;
        }

        public void setНаименование(String наименование) {
            this.наименование = наименование;
        }
    }
    public static class НаимГрнДата {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }
    public static class ОснВидДеятельности {
        @SerializedName("код")
        @Expose
        private String код;
        @SerializedName("наим")
        @Expose
        private String наим;
        @SerializedName("версия")
        @Expose
        private String версия;
        @SerializedName("ГрнObject")
        @Expose
        Грн ГрнObject;


        // Getter Methods

        public String getКод() {
            return код;
        }

        public String getНаим() {
            return наим;
        }

        public String getВерсия() {
            return версия;
        }

        public Грн getГрн() {
            return ГрнObject;
        }

        // Setter Methods

        public void setКод(String код) {
            this.код = код;
        }

        public void setНаим(String наим) {
            this.наим = наим;
        }

        public void setВерсия(String версия) {
            this.версия = версия;
        }

        public void setГрн(Грн грнObject) {
            this.ГрнObject = грнObject;
        }
    }
    public static class Грн {
        @SerializedName("грн")
        @Expose
        private String грн;
        @SerializedName("дата")
        @Expose
        private String дата;


        // Getter Methods

        public String getГрн() {
            return грн;
        }

        public String getДата() {
            return дата;
        }

        // Setter Methods

        public void setГрн(String грн) {
            this.грн = грн;
        }

        public void setДата(String дата) {
            this.дата = дата;
        }
    }
    public static class СвРегФСС {
        @SerializedName("кодФСС")
        @Expose
        private String кодФСС;
        @SerializedName("наимФСС")
        @Expose
        private String наимФСС;
        @SerializedName("регНомФСС")
        @Expose
        private String регНомФСС;
        @SerializedName("датаРег")
        @Expose
        private String датаРег;
        @SerializedName("ГрнДата")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getКодФСС() {
            return кодФСС;
        }

        public String getНаимФСС() {
            return наимФСС;
        }

        public String getРегНомФСС() {
            return регНомФСС;
        }

        public String getДатаРег() {
            return датаРег;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setКодФСС(String кодФСС) {
            this.кодФСС = кодФСС;
        }

        public void setНаимФСС(String наимФСС) {
            this.наимФСС = наимФСС;
        }

        public void setРегНомФСС(String регНомФСС) {
            this.регНомФСС = регНомФСС;
        }

        public void setДатаРег(String датаРег) {
            this.датаРег = датаРег;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

    public static class СвРегПФ {
        @SerializedName("кодПФ")
        @Expose
        private String кодПФ;
        @SerializedName("наимПФ")
        @Expose
        private String наимПФ;
        @SerializedName("регНомПФ")
        @Expose
        private String регНомПФ;
        @SerializedName("датаРег")
        @Expose
        private String датаРег;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getКодПФ() {
            return кодПФ;
        }

        public String getНаимПФ() {
            return наимПФ;
        }

        public String getРегНомПФ() {
            return регНомПФ;
        }

        public String getДатаРег() {
            return датаРег;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setКодПФ(String кодПФ) {
            this.кодПФ = кодПФ;
        }

        public void setНаимПФ(String наимПФ) {
            this.наимПФ = наимПФ;
        }

        public void setРегНомПФ(String регНомПФ) {
            this.регНомПФ = регНомПФ;
        }

        public void setДатаРег(String датаРег) {
            this.датаРег = датаРег;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }

    public static class СвРегОрг {
        @SerializedName("кодНО")
        @Expose
        private String кодНО;
        @SerializedName("наимНО")
        @Expose
        private String наимНО;
        @SerializedName("адрРО")
        @Expose
        private String адрРО;
        @SerializedName("ГрнДата")
        @Expose
        ГрнДата ГрнДата;


        // Getter Methods

        public String getКодНО() {
            return кодНО;
        }

        public String getНаимНО() {
            return наимНО;
        }

        public String getАдрРО() {
            return адрРО;
        }

        public ГрнДата getГрнДата() {
            return ГрнДата;
        }

        // Setter Methods

        public void setКодНО(String кодНО) {
            this.кодНО = кодНО;
        }

        public void setНаимНО(String наимНО) {
            this.наимНО = наимНО;
        }

        public void setАдрРО(String адрРО) {
            this.адрРО = адрРО;
        }

        public void setГрнДата(ГрнДата грнДата) {
            this.ГрнДата = грнДата;
        }
    }

    public static class СвУчетНО {
        @SerializedName("кодНО")
        @Expose
        private String кодНО;
        @SerializedName("наимНО")
        @Expose
        private String наимНО;
        @SerializedName("датаПостУч")
        @Expose
        private String датаПостУч;
        @SerializedName("ГрнДатаObject")
        @Expose
        ГрнДата ГрнДатаObject;


        // Getter Methods

        public String getКодНО() {
            return кодНО;
        }

        public String getНаимНО() {
            return наимНО;
        }

        public String getДатаПостУч() {
            return датаПостУч;
        }

        public ГрнДата getГрнДата() {
            return ГрнДатаObject;
        }

        // Setter Methods

        public void setКодНО(String кодНО) {
            this.кодНО = кодНО;
        }

        public void setНаимНО(String наимНО) {
            this.наимНО = наимНО;
        }

        public void setДатаПостУч(String датаПостУч) {
            this.датаПостУч = датаПостУч;
        }

        public void setГрнДата(ГрнДата грнДатаObject) {
            this.ГрнДатаObject = грнДатаObject;
        }
    }
    public static class свДолжнФЛ{
        @SerializedName("фио")
        @Expose
        private Фио фио;

        public Фио getФио() {
            return фио;
        }

        public void setФио(Фио фио) {
            this.фио = фио;
        }

        public String getИнн() {
            return инн;
        }

        public void setИнн(String инн) {
            this.инн = инн;
        }

        public String getВидДолжн() {
            return видДолжн;
        }

        public void setВидДолжн(String видДолжн) {
            this.видДолжн = видДолжн;
        }

        public String getНаимВидДолжн() {
            return наимВидДолжн;
        }

        public void setНаимВидДолжн(String наимВидДолжн) {
            this.наимВидДолжн = наимВидДолжн;
        }

        public String getНаимДолжн() {
            return наимДолжн;
        }

        public void setНаимДолжн(String наимДолжн) {
            this.наимДолжн = наимДолжн;
        }

        public ГрнДата getГрнДата() {
            return грнДата;
        }

        public void setГрнДата(ГрнДата грнДата) {
            this.грнДата = грнДата;
        }

        @SerializedName("инн")
        @Expose
        private String инн;
        @SerializedName("видДолжн")
        @Expose
        private String видДолжн;
        @SerializedName("наимВидДолжн")
        @Expose
        private String наимВидДолжн;
        @SerializedName("наимДолжн")
        @Expose
        private String наимДолжн;
        @SerializedName("грнДата")
        @Expose
        private ГрнДата грнДата;
    }

    public static class Фио{


        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("patronymic")
        @Expose
        private String patronymic;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }
    }
}

