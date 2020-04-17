package ai.estsoft.rounz_vf_android.external.response

sealed class CreateProfilePropertyResponse {
    object Success : CreateProfilePropertyResponse()

    class Failure(val throwable: Throwable) : CreateProfilePropertyResponse()
}