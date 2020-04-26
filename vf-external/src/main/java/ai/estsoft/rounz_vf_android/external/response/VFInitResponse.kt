package ai.estsoft.rounz_vf_android.external.response

sealed class VFInitResponse {
    object Success : VFInitResponse()
    class Failure(val throwable: Throwable) : VFInitResponse()
}