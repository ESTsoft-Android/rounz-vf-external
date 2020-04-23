package ai.estsoft.rounz_vf_android.external.response

sealed class VfInitResponse {
    object Success : VfInitResponse()
    class Failure(val throwable: Throwable) : VfInitResponse()
}