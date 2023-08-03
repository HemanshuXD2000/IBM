import {Songs} from "./Excercise17";

class Playlist
{
    private songs:Songs[] = [];
    static maxSongs:number = 10;

    constructor(public playlistId:string) {
    }

    addSong(song:Songs)
    {
        if (this.songs.length >= Playlist.maxSongs)
        {
            throw new Error('Too Many Songs in your Playlist.')
        }
        else
        {
            this.songs.push(song);
        }
    }
}
let songPlaylist = new Playlist('Playlist01');

let namePlaylist = songPlaylist.playlistId;

songPlaylist.addSong(new Songs('Hey Jude(Single)','Hey Jude','POP'));

let maxSongs = Playlist.maxSongs;