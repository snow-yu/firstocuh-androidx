package com.firstouch.app.data

import androidx.appcompat.app.AppCompatDelegate

/**
 * ===============================
 * 主题数据类型
 * @author jiaxue
 * @date 2/3/21 11:23 AM
 * ================================
 */
enum class Theme(val model: Int) {
    LIGHT(AppCompatDelegate.MODE_NIGHT_NO),
    DARK(AppCompatDelegate.MODE_NIGHT_YES),
    SYSTEM(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
}