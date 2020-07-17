package ai.estsoft.rounz_vf_android.external.interfaces

import ai.estsoft.rounz_vf_android.external.model.VFScaleType
import ai.estsoft.rounz_vf_android.external.response.VFActionResponse
import ai.estsoft.rounz_vf_android.external.response.VFInitResponse
import ai.estsoft.rounz_vf_android.external.response.VFStoreResponse
import java.io.File

interface VF {

    /**
     * VF 에 필요한 리소스들을 로드하며, 초기화 작업 진행
     *
     * @return 초기화 작업 결과
     */
    fun init(
    ): VFInitResponse

    /**
     *  피팅 준비를 하는 Action Url 생성
     *
     * @return Action Url 생성 완료 결과
     */
    fun prepare(
    ): VFActionResponse

    /**
     * 피팅뷰의 스케일 타입을 변경하는 Action Url 생성
     *
     * @param scaleType 뷰 타입
     * @return Action Url 생성 완료 결과
     */
    fun scaleType(
        scaleType: VFScaleType
    ): VFActionResponse

    /**
     * 요청한 파라미터로 피팅 이미지 렌더링을 요청하는 Action Url 생성
     * 안경다리 및 얼굴 방향은 내부에서 저장해두었던 값을 이용해서 피팅 처리
     *
     * @param vfResourceId 피팅할 리소스 ID
     * @param profileName 피팅할 프로필, O2BaseAssets 하위 경로가 되어야 합니다.
     * @return Action Url 생성 완료 결과
     */
    fun requestRender(
        vfResourceId: String,
        profileName: String
    ): VFActionResponse

    /**
     * 요청한 파라미터로 피팅 이미지 렌더링을 요청하는 Action Url 생성
     * 안경다리 및 얼굴 방향은 파라미터로 전달 받는 변화량을 이용해서 피팅 처리
     *
     * @param vfResourceId 피팅할 리소스 ID
     * @param profileName 피팅할 프로필, O2BaseAssets 하위 경로가 되어야 합니다.
     * @param front
     * @param rear
     * @param legLength
     * @param faceYaw
     * @return Action Url 생성 완료 결과
     */
    fun requestRenderOnGesture(
        vfResourceId: String,
        profileName: String,
        front: Float = 0f, rear: Float = 0f, legLength: Float = 0f, faceYaw: Float = 0f
    ): VFActionResponse

    /**
     * 마지막 렌더링 정보를 저장
     * [requestRender]에서의 렌더링 요청은 내부에서 저장해뒀던 이 정보를 이용해서 피팅 처리
     *
     * @see front
     * @see rear
     * @see legLength
     * @see faceYaw
     */
    fun updateLastRenderProperty(
        front: Float,
        rear: Float,
        legLength: Float,
        faceYaw: Float
    )

    /**
     * 렌더링 정보를 초기화 한다.
     * 얼굴 방향, 안경 다리 등을 초기 상태로 돌려 놓는다.
     */
    fun clearLastRenderProperty()

    /**
     * 현재 상품이 착용되어 있는화면을 저장하는 요청 Url 생성
     *
     * @return Action Url 생성 완료 결과
     */
    fun requestCapture(
    ): VFActionResponse

    /**
     * 전달받은 이미지 버퍼를 전달받은 파일 경로에 저장
     *
     * @param file 저장되는 파일경로
     * @param imageBuffer base64 인코딩된 이미지 버퍼
     * @return 저장 완료 결과
     */
    fun storeCaptureImage(
        file: File,
        imageBuffer: String
    ): VFStoreResponse
}