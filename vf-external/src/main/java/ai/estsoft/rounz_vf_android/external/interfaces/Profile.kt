package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.FaceSize
import ai.estsoft.rounz_vf_android.external.model.Gender
import ai.estsoft.rounz_vf_android.external.model.ProfileType

interface Profile {
    /**
     * 저장된 프로필의 타입을 가져옵니다.
     *
     * @param profileName 프로필 이름
     * @return [ProfileType] 프로필 타입
     */
    fun getProfileType(profileName: String): ProfileType

    /**
     * 저장된 프로필의 성별을 가져옵니다.
     *
     * @param profileName 프로필 이름
     * @return [Gender] 성별
     */
    fun getProfileGender(profileName: String): Gender

    /**
     * 저장된 프로필의 얼굴 크기를 가져옵니다.
     *
     * @param profileName 프로필 이름
     * @return [FaceSize] 얼굴 크기
     */
    fun getProfileFaceSize(profileName: String): FaceSize

    /**
     * 프로필 설정파일을 업데이트 합니다.
     *
     * @param profileName 프로필 이름
     * @param gender 프로필 성별
     * @param faceSize 프로필 얼굴 크기
     */
    fun updateFaceInfo(
        profileName: String,
        gender: Gender,
        faceSize: FaceSize
    )
}