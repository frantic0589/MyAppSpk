package com.example.myappspk.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

import lombok.Data;

@Data

public class Company {
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("update")
    @Expose
    public String update;
    @SerializedName("тип")
    @Expose
    public String тип;
    @SerializedName("датаВып")
    @Expose
    public String датаВып;
    @SerializedName("датаОгрн")
    @Expose
    public String датаОгрн;
    @SerializedName("огрн")
    @Expose
    public String огрн;
    @SerializedName("инн")
    @Expose
    public String инн;
    @SerializedName("статусНаим")
    @Expose
    public String статусНаим;
    @SerializedName("статусКод")
    @Expose
    public String статусКод;
    @SerializedName("имяПолное")
    @Expose
    public String имяПолное;
    @SerializedName("имяКраткое")
    @Expose
    public String имяКраткое;
    @SerializedName("свУчетНО")
    @Expose
    СвУчетНО СвУчетНОObject;
    @SerializedName("свРегОрг")
    @Expose
    СвРегОрг СвРегОргObject;
    @SerializedName("свРегПФ")
    @Expose
    СвРегПФ СвРегПФObject;
    @SerializedName("свРегФСС")
    @Expose
    СвРегФСС СвРегФССObject;
    @SerializedName("оснВидДеятельности")
    @Expose
    ОснВидДеятельности ОснВидДеятельностиObject;
    @SerializedName("допВидДеятельности")
    @Expose
    ArrayList<Object> допВидДеятельности = new ArrayList<Object>();
    @SerializedName("свЗап")
    @Expose
    ArrayList<Object> свЗап = new ArrayList<Object>();
    @SerializedName("кпп")
    @Expose
    public String кпп;
    @SerializedName("спрОПФ")
    @Expose
    public String спрОПФ;
    @SerializedName("кодОПФ")
    @Expose
    public String кодОПФ;
    @SerializedName("наимГрнДата")
    @Expose
    НаимГрнДата НаимГрнДатаObject;
    @SerializedName("полнНаимОПФ")
    @Expose
    public String полнНаимОПФ;
    @SerializedName("свАдрес")
    @Expose
    СвАдрес СвАдресObject;
    @SerializedName("свОбрЮЛ")
    @Expose
    СвОбрЮЛ СвОбрЮЛObject;
    @SerializedName("свУстКап")
    @Expose
    СвУстКап СвУстКапObject;
    @SerializedName("учрФЛ")
    @Expose
    ArrayList<Object> учрФЛ = new ArrayList<Object>();
    @SerializedName("свДолжнФЛ")
    @Expose
    ArrayList<свДолжнФЛ> свДолжнФЛ = new ArrayList<свДолжнФЛ>();
}
@Data
class ГрнДата {
        @SerializedName("грн")
        @Expose
        public String грн;
        @SerializedName("дата")
        @Expose
        public String дата;
}

    @Data
    class СвОбрЮЛ {
        @SerializedName("кодСпОррЮЛ")
        @Expose
        public String кодСпОррЮЛ;
        @SerializedName("наимСпОбрЮЛ")
        @Expose
        public String наимСпОбрЮЛ;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;
}
@Data
class СвАдрес {
        @SerializedName("адресРФ")
        @Expose
        АдресРФ АдресРФObject;
    }
@Data
class АдресРФ {
        @SerializedName("регион")
        @Expose
        Регион РегионObject;
        @SerializedName("город")
        @Expose
        Город ГородObject;
        @SerializedName("улица")
        @Expose
        Улица УлицаObject;
        @SerializedName("индекс")
        @Expose
        public String индекс;
        @SerializedName("кодРегион")
        @Expose
        public String кодРегион;
        @SerializedName("кодАдрКладр")
        @Expose
        public String кодАдрКладр;
        @SerializedName("дом")
        @Expose
        public String дом;
        @SerializedName("кварт")
        @Expose
        public String кварт;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;
    }
@Data
class Улица {
        @SerializedName("тип")
        @Expose
        public String тип;
        @SerializedName("наименование")
        @Expose
        public String наименование;
    }
@Data
class Город {
        @SerializedName("тип")
        @Expose
        public String тип;
        @SerializedName("наименование")
        @Expose
        public String наименование;
    }
@Data
class Регион {
        @SerializedName("тип")
        @Expose
        public String тип;
        @SerializedName("наименование")
        @Expose
        public String наименование;
    }
@Data
class НаимГрнДата {
        @SerializedName("грн")
        @Expose
        public String грн;
        @SerializedName("дата")
        @Expose
        public String дата;
    }
@Data
class ОснВидДеятельности {
        @SerializedName("код")
        @Expose
        public String код;
        @SerializedName("наим")
        @Expose
        public String наим;
        @SerializedName("версия")
        @Expose
        public String версия;
        @SerializedName("грн")
        @Expose
        Грн ГрнObject;
    }
@Data
class Грн {
        @SerializedName("грн")
        @Expose
        public String грн;
        @SerializedName("дата")
        @Expose
        public String дата;
    }
@Data
class СвРегФСС {
        @SerializedName("кодФСС")
        @Expose
        public String кодФСС;
        @SerializedName("наимФСС")
        @Expose
        public String наимФСС;
        @SerializedName("регНомФСС")
        @Expose
        public String регНомФСС;
        @SerializedName("датаРег")
        @Expose
        public String датаРег;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;
    }

@Data
class СвРегПФ {
        @SerializedName("кодПФ")
        @Expose
        public String кодПФ;
        @SerializedName("наимПФ")
        @Expose
        public String наимПФ;
        @SerializedName("регНомПФ")
        @Expose
        public String регНомПФ;
        @SerializedName("датаРег")
        @Expose
        public String датаРег;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;
    }

@Data
class СвРегОрг {
        @SerializedName("кодНО")
        @Expose
        public String кодНО;
        @SerializedName("наимНО")
        @Expose
        public String наимНО;
        @SerializedName("адрРО")
        @Expose
        public String адрРО;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;
    }
@Data
class СвУчетНО {
        @SerializedName("кодНО")
        @Expose
        public String кодНО;
        @SerializedName("наимНО")
        @Expose
        public String наимНО;
        @SerializedName("датаПостУч")
        @Expose
        public String датаПостУч;
        @SerializedName("грнДата")
        @Expose
        ГрнДата ГрнДатаObject;
    }
@Data
class свДолжнФЛ{
        @SerializedName("фио")
        @Expose
        public Фио фио;
        @SerializedName("инн")
        @Expose
        public String инн;
        @SerializedName("видДолжн")
        @Expose
        public String видДолжн;
        @SerializedName("наимВидДолжн")
        @Expose
        public String наимВидДолжн;
        @SerializedName("наимДолжн")
        @Expose
        public String наимДолжн;
        @SerializedName("грнДата")
        @Expose
        public ГрнДата грнДата;
    }

@Data
class Фио{
        @SerializedName("firstName")
        @Expose
        public String firstName;
        @SerializedName("lastName")
        @Expose
        public String lastName;
        @SerializedName("patronymic")
        @Expose
        public String patronymic;
    }

@Data
class СвУстКап {
    @SerializedName("наимВидКап")
    @Expose
    public String наимВидКап;
    @SerializedName("сумКап")
    @Expose
    public float сумКап;
    @SerializedName("грнДата")
    @Expose
    ГрнДата ГрнДатаObject;
}


