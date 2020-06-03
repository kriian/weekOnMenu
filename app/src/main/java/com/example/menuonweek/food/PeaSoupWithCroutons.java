package com.example.menuonweek.food;

import com.example.menuonweek.R;

public class PeaSoupWithCroutons implements RecipeInterface {
    @Override
    public int getImageResource() {
        return R.drawable.sup_goroh;
    }

    @Override
    public String getTitle() {
        return "Гороховый суп с гренками";
    }

    @Override
    public String getDescription() {
        return "Общее время готовки – 1 час 15 минут   (без времени замачивания гороха)";
    }

    @Override
    public String getRecipe() {
        return "Общее время готовки – 1 час 15 минут   (без времени замачивания гороха)\n" +
                "Активное время готовки – 25 минут  \n" +
                "Калорийность на 100 гр – 78 ккал\n" +
                "\nИнгрeдиенты:\n" +
                "Горох – 1 стакан\n" +
                "Хлеб – 1/3 буханки (ржаной)\n" +
                "Картофель – 3 шт.\n" +
                "Морковь – 1 шт.\n" +
                "Чеснок – 6 зубчиков\n" +
                "Петрушка – 1 веточка. (или укроп)\n" +
                "Масло растительное – для обжарки гренок\n" +
                "\nПриготовление:" +
                "\n" + "1. Гороховый суп с гренками – это блюдо, которое нужно начинать готовить с вечера. Замачиваем горох (на 1 стакан гороха 2ст. воды) и оставляем до утра. Можно, в принципе, начинать варить горох без этой процедуры, но тогда он будет вариться 2—3 часа, и вся квартира пропахнет гороховым ароматом.\n" +
                "\n" + "2. Воду сливаем, добавляем 4 стакана воды и ставим вариться примерно на час. Можно варить на мясном бульоне. Когда горох начнет развариваться, он готов. Я очень люблю, когда горох разваривается практически до пюреобразного состояния, но этот на любителя.\n" +
                "\n" + "3. Пока варится горох, нарезаем картофель, морковь (я не очень люблю вкус вареной моркови, поэтому тру ее на самой мелкой терке). За 15 минут до окончания варки добавляем все это в суп, солим и выключаем.\n" +
                "\n4. Делаем гренки! Хлеб нарезаем кубиками и обжариваем в масле. Огонь должен быть достаточно сильным, чтобы гренки сверху были хрустящими, а в середине мягкими. Чтобы они не подгорели, их следует все время помешивать.\n" +
                "Масла не жалеем, так как хлеб его в себя впитывает очень много. Но так как суп у нас без капли масла и жира, то это даже к лучшему. Как только гренки поджарились, выключаем огонь и пересыпаем их раздавленным чесноком и рубленой зеленью. Если зелени нет, то можно обойтись только чесноком.\n" +
                "\n5. Наливаем гороховый суп в тарелку, сверху щедро посыпаем гренками и подаем. Все готово. \nПриятного аппетита!";
    }
}