export class Songs{
    constructor(private album:string, private name:string, private genres:string) {
    }
    playSong()
    {
        console.log('Playing a '+this.genres+' song '+this.name+' from the album '+this.album);
    }
}

export class Jukebox{
    constructor(private songs:Songs[], private SongCount:number) {
        this.SongCount = songs.length;
    }
    playSong()
    {
        let song = this.newSong();
        song.playSong();
    }

    private newSong() {
        let newPlaySong = Math.floor(Math.random()*songCount);
        return this.songs[newPlaySong];
    }
}

let songsList = [
    new Songs('Collage','Closer','POP'),
    new Songs('Bouquet','Roses','EDM'),
    new Songs('Fearless','Love Story','POP'),
    new Songs('1989','Fearless','POP')
];

let songCount = songsList.length;
const song = new Jukebox(songsList,songCount);
song.playSong();
