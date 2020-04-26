package ai.estsoft.rounz_vf_android.external.response

sealed class CreateFaceInfoResponse {
    object Success : CreateFaceInfoResponse()

    class Failure(val throwable: Throwable) : CreateFaceInfoResponse()
}