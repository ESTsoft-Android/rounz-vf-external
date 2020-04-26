package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.FaceSize
import ai.estsoft.rounz_vf_android.external.model.Gender
import ai.estsoft.rounz_vf_android.external.response.CreateFaceInfoResponse
import ai.estsoft.rounz_vf_android.external.response.CreateProfileResponse

interface OneCutProfile {
    /**
     * 단컷 프로필 이미지를 생성합니다.
     *
     * @param url 프로필 서버 url
     * @param imageUri 프로필 이미지를 생성할 [android.net.Uri] 형식의 [String] 타입 이미지 uri 입니다.
     * @return 이미지 프로핊 생성 완료 결과
     */
    fun createOneCutProfile(
        url: String,
        imageUri: String
    ): CreateProfileResponse

    /**
     * 단컷 이미지 프로필의 설정 파일을 생성합니다.
     *
     * 호출 시점은 반드시 [OneCutProfile.createOneCutProfile] 먼저 선행되어야 하며,
     * [CreateProfileResponse.Success] 응답을 받은 이후에 호출해야 합니다.
     *
     * @param gender 성별 정보
     * @param faceSize 얼굴 사이즈 정보
     * @return 이미지 프로필 설정 파일 생성 완료 결과
     */
    fun createOneCutFaceInfo(
        gender: Gender,
        faceSize: FaceSize
    ): CreateFaceInfoResponse
}