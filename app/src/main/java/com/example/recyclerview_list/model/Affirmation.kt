package com.example.recyclerview_list.model
import androidx.recyclerview.widget.RecyclerView

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int

)