package com.firstouch.app.ui.theme

import androidx.annotation.StyleRes
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.firstouch.app.data.Theme

/**
 * ===============================
 * 主题样式vm
 * @author jiaxue
 * @date 2/3/21 11:21 AM
 * ================================
 */
class ThemeViewModel:ViewModel() {

    val primaryColor = MutableLiveData<@StyleRes Int>()
    val currentTheme = MutableLiveData<Theme>(Theme.SYSTEM)
    val edgeToEdgeEnabled = MutableLiveData<Boolean>(false)

    fun setCurrentTheme(theme: Theme) {
        //防抖
        if (theme == currentTheme.value) return
        currentTheme.value = theme
    }
}