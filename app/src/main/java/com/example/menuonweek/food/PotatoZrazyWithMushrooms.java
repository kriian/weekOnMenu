package com.example.menuonweek.food;

import com.example.menuonweek.R;

public class PotatoZrazyWithMushrooms implements RecipeInterface {
    @Override
    public int getImageResource() {
        return R.drawable.kartofelnye_zrazy_s_gribami;
    }

    @Override
    public String getTitle() {
        return "Картофельные зразы с грибами";
    }

    @Override
    public String getDescription() {
        return "Чудесное блюдо к ужину, за которое ваши домашние будут искренне вам благодарны";
    }

    @Override
    public String getRecipe() {
        return "Общее время готовки – 1 час 0 минута \n" +
                "Активное время готовки – 0 часов 40 минут \n" +
                "Калорийность на 100 гр — 93 ккал\n" +
                "Количество порций – 6 порций";
    }
}
