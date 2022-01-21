#include <jni.h>
#include <string>

// já fez no projeto de exemplo
extern "C" JNIEXPORT jstring JNICALL
Java_com_hugo_testesoma_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

// nossa função criada
extern "C" JNIEXPORT /* parte da convenção jni */
jint /* tipo de retorna da função C */
JNICALL /* parte da convenção jni */

// [Java_] + [pacote] + [_] + [nome da classe] + [_] + [nome do método]
Java_com_hugo_testesoma_MainActivity_somaFromJNI(
        JNIEnv* env, /* parte da convenção jni */
        jobject /* this */, /* parte da convenção jni */
        jint numA, /* tipo do meu parâmetro da função java/kotlin */
        jint numB /* tipo do meu parâmetro da função java/kotlin */
        ) {

    // corpo da função
    return numA + numB;

}

// função real
extern "C" JNIEXPORT jint JNICALL
Java_com_hugo_testesoma_Calculadora_soma(
        JNIEnv* env,
        jobject,
        jint num
        ) {
    return num + 5;
}
