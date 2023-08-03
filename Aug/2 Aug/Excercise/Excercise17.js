"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Jukebox = exports.Songs = void 0;
var Songs = /** @class */ (function () {
    function Songs(album, name, genres) {
        this.album = album;
        this.name = name;
        this.genres = genres;
    }
    Songs.prototype.playSong = function () {
        console.log('Playing a ' + this.genres + ' song ' + this.name + ' from the album ' + this.album);
    };
    return Songs;
}());
exports.Songs = Songs;
var Jukebox = /** @class */ (function () {
    function Jukebox(songs, SongCount) {
        this.songs = songs;
        this.SongCount = SongCount;
        this.SongCount = songs.length;
    }
    Jukebox.prototype.playSong = function () {
        var song = this.newSong();
        song.playSong();
    };
    Jukebox.prototype.newSong = function () {
        var newPlaySong = Math.floor(Math.random() * songCount);
        return this.songs[newPlaySong];
    };
    return Jukebox;
}());
exports.Jukebox = Jukebox;
var songsList = [
    new Songs('Collage', 'Closer', 'POP'),
    new Songs('Bouquet', 'Roses', 'EDM'),
    new Songs('Fearless', 'Love Story', 'POP'),
    new Songs('1989', 'Fearless', 'POP')
];
var songCount = songsList.length;
var song = new Jukebox(songsList, songCount);
song.playSong();
