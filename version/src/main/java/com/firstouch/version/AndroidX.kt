package com.firstouch.version

/**
 * ===============================
 * androidx依赖包
 * @author jiaxue
 * @date 2/2/21 10:22 AM
 * ================================
 */

private object AndroidxVersion {

    const val CORE_KTX = "1.3.2"
    const val APP_COMPAT = "1.2.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val LIFECYCLE = "2.2.0"
    const val NAVIGATION = "2.3.2"
}

object AndroidX {

    // 针对最新的平台功能和 API 调整应用，同时还支持旧设备
    const val CORE_KTX = "androidx.core:core-ktx:${AndroidxVersion.CORE_KTX}"

    // 允许在平台旧版 API 上访问新 API（很多使用 Material Design
    const val APP_COMPAT = "androidx.appcompat:appcompat:${AndroidxVersion.APP_COMPAT}"

    // 使用相对定位灵活地确定微件的位置和大小
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${AndroidxVersion.CONSTRAINT_LAYOUT}"

    // 生命周期
    const val LIFECYCLE_VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${AndroidxVersion.LIFECYCLE}"
    const val LIFECYCLE_VIEW_DATA_KTX =
        "androidx.lifecycle:lifecycle-livedata-ktx:${AndroidxVersion.LIFECYCLE}"
    const val LIFECYCLE_EXTENSIONS = "android.arch.lifecycle:extensions:${AndroidxVersion.LIFECYCLE}"

    // 导航框架
    const val NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${AndroidxVersion.NAVIGATION}"
    // Feature module Support
    const val NAVIGATION_FEATURES_FRAGMENT =
        "androidx.navigation:navigation-dynamic-features-fragment:${AndroidxVersion.NAVIGATION}"


}