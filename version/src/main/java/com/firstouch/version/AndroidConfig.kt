/**
 * ===============================
 * app应用构建版本
 * @author jiaxue
 * @date 2/1/21 5:47 PM
 * ================================
 */
object AndroidConfig {
    // 编译app的Android SDK版本
    const val COMPILE_SDK_VERSION = 30
    //构建工具的版本
    const val BUILD_TOOLS_VERSION = "30.0.2"
    // app可以运行的最低要求
    const val MIN_SDK_VERSION = 21
    // app所使用这个所设定的版本及该版本前的所有特性
    const val TARGET_SDK_VERSION = 30

    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val APPLICATION_ID = "com.firstouch.app"

    const val TEST_INSTRUMENTATION_RUNNER = "android.support.test.runner.AndroidJUnitRunner"
}