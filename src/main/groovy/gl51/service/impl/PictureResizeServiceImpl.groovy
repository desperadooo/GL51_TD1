package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureFetchService
import gl51.service.PictureResizeService

import javax.inject.Inject

class PictureResizeServiceImpl implements PictureResizeService {
    Picture resize(){
        Picture p = PictureFetchService.fetchPicture()
        p.height(1024)
        p.width(1024)
        return p
    }
}
