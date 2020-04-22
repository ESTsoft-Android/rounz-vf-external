package ai.estsoft.rounz_vf_android.external.response

sealed class CreateProfileResponse {
    class Success(val profilePath: String) : CreateProfileResponse()

    object NotDetectedFace : CreateProfileResponse()

    object NetworkError : CreateProfileResponse()

    class Failure(val throwable: Throwable) : CreateProfileResponse()
}